package at.luuk.lolapiwrapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

import at.luuk.lolapiwrapper.entity.Summoner;
import at.luuk.lolapiwrapper.exception.LeagueAPIException;

public class LeagueAPI {

	private String apiKey;
	private String region;
	private String url;

	public LeagueAPI(String apiKey, String region) {
		this.apiKey = apiKey;
		this.region = region;
		url = "http://prod.api.pvp.net/api/lol/" + region + "/v1.1/";
	}

	/**
	 * <strong>CAREFUL:</strong> This retrieves a Summoner object from the
	 * official Riot API and therefore uses one of your API key requests you can
	 * make for a short period of time. You may consider caching the data you
	 * get or ask Riot for a higher-priority API key. <br>
	 * <br>
	 * Retrieves a summoner object of the summoner with given name.
	 * 
	 * @param summonerName
	 *            the summoner's name
	 * @return summoner object
	 * @throws LeagueAPIException
	 */
	public Summoner getSummoner(String summonerName) {
		String jsonString = request(this.url + "summoner/by-name/" + summonerName + "?api_key=" + this.apiKey);
		Summoner summoner = new Gson().fromJson(jsonString, Summoner.class);

		return summoner;
	}

	public static String request(String url) {
		URLConnection connection = null;
		StringBuilder builder = null;

		try {
			URL urlIn = new URL(url);
			connection = urlIn.openConnection();
			String line;
			builder = new StringBuilder();

			InputStream inputStream = null;
			try {
				inputStream = connection.getInputStream();
			} catch (FileNotFoundException e) {
				throw new LeagueAPIException("Error 404: The API couldn't find a match to your parameters.");
			}
			if (inputStream == null) {
				throw new LeagueAPIException("Response empty");
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			while ((line = reader.readLine()) != null) {
				builder.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LeagueAPIException e) {
			e.printStackTrace();
		}

		return builder.toString();
	}
}
