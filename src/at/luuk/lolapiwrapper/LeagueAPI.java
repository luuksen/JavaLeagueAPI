package at.luuk.lolapiwrapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import at.luuk.lolapiwrapper.entity.League;
import at.luuk.lolapiwrapper.entity.Leagues;
import at.luuk.lolapiwrapper.entity.RecentGames;
import at.luuk.lolapiwrapper.entity.Summoner;
import at.luuk.lolapiwrapper.exception.LeagueAPIException;

public class LeagueAPI {

	public enum Region {
		EUW,
		EUNE,
		NA;
	}
	
	private String apiKey;
	private static String BASEURL_V1;
	private static String BASEURL_V2;

	public LeagueAPI(String apiKey, Region region) {
		this.apiKey = apiKey;
		LeagueAPI.BASEURL_V1 = "http://prod.api.pvp.net/api/lol/" + region.name().toLowerCase() + "/v1.1/";
		LeagueAPI.BASEURL_V2 = "http://prod.api.pvp.net/api/" + region.name().toLowerCase() + "/v2.1/";
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
		String jsonString = LeagueAPI.request(BASEURL_V1 + "summoner/by-name/" + summonerName + "?api_key=" + this.apiKey);
		Summoner summoner = new Gson().fromJson(jsonString, Summoner.class);

		return summoner;
	}

	/**
	 * <strong>CAREFUL:</strong> This retrieves a Summoner object from the
	 * official Riot API and therefore uses one of your API key requests you can
	 * make for a short period of time. You may consider caching the data you
	 * get or ask Riot for a higher-priority API key. <br>
	 * <br>
	 * Retrieves recent games of given summonerId.
	 * 
	 * @param summonerId
	 *            summoner's id
	 * @return recent games
	 * @throws LeagueAPIException
	 */
	public RecentGames getRecentGames(Long summonerId) {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "game/by-summoner/" + summonerId + "/recent?api_key=" + this.apiKey);
		RecentGames recentGames = new Gson().fromJson(jsonString, RecentGames.class);

		return recentGames;
	}
	
	public Map<String, League> getLeagues(Long summonerId) {
		String jsonString = LeagueAPI.request(BASEURL_V2 + "league/by-summoner/" + summonerId + "?api_key=" + this.apiKey);

		Gson gson = new Gson();
		Map<String, League> decoded = gson.fromJson(jsonString, new TypeToken<Map<String, League>>(){}.getType());
		
		return decoded;
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
