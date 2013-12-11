package at.luuk.lolapiwrapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import at.luuk.lolapiwrapper.entity.ChampionList;
import at.luuk.lolapiwrapper.entity.League;
import at.luuk.lolapiwrapper.entity.MasteryPages;
import at.luuk.lolapiwrapper.entity.PlayerStatsSummaryList;
import at.luuk.lolapiwrapper.entity.RankedStats;
import at.luuk.lolapiwrapper.entity.RecentGames;
import at.luuk.lolapiwrapper.entity.RunePages;
import at.luuk.lolapiwrapper.entity.Summoner;
import at.luuk.lolapiwrapper.entity.Team;
import at.luuk.lolapiwrapper.exception.LeagueAPIException;

/**
 * The MIT License (MIT) Copyright (c) 2013 Lukas Greilinger
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 * @author Lukas Greilinger (luukseN @ EUW)
 * @version 1.0
 * 
 */
public class LeagueAPI {

	public enum Region {
		EUW, EUNE, NA;
	}

	public enum Season {
		SEASON3, SEASON4;
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
	 * Retrieves a summoner object of the summoner with given name.
	 * 
	 * @param summonerName
	 *            the summoner's name
	 * @return summoner
	 */
	public Summoner getSummoner(String summonerName) {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "summoner/by-name/" + summonerName + "?api_key="
				+ this.apiKey);
		Summoner summoner = new Gson().fromJson(jsonString, Summoner.class);

		return summoner;
	}

	/**
	 * Retrieves a summoner object of the summoner with given id.
	 * 
	 * @param summonerName
	 *            the summoner's id
	 * @return summoner
	 */
	public Summoner getSummoner(Long summonerId) {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "summoner/" + summonerId + "?api_key=" + this.apiKey);
		Summoner summoner = new Gson().fromJson(jsonString, Summoner.class);

		return summoner;
	}

	/**
	 * Retrieves recent games of given summonerId.
	 * 
	 * @return list of all champions in the game
	 */
	public ChampionList getChampionList() {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "champion?api_key=" + this.apiKey);
		ChampionList championList = new Gson().fromJson(jsonString, ChampionList.class);

		return championList;
	}

	/**
	 * Retrieves recent games of given summonerId.
	 * 
	 * @param summonerId
	 *            summoner's id
	 * @return recent games
	 */
	public RecentGames getRecentGames(Long summonerId) {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "game/by-summoner/" + summonerId + "/recent?api_key="
				+ this.apiKey);
		RecentGames recentGames = new Gson().fromJson(jsonString, RecentGames.class);

		return recentGames;
	}

	/**
	 * Retrieves leagues of summoner with given summonerId
	 * 
	 * @param summonerId
	 *            summoner's id
	 * @return A map with the league name and the related League object
	 */
	public Map<String, League> getLeagues(Long summonerId) {
		String jsonString = LeagueAPI.request(BASEURL_V2 + "league/by-summoner/" + summonerId + "?api_key="
				+ this.apiKey);

		Gson gson = new Gson();
		Map<String, League> decoded = gson.fromJson(jsonString, new TypeToken<Map<String, League>>() {
		}.getType());

		return decoded;
	}

	/**
	 * Retrieves player stats of summoner with given summonerId and season
	 * 
	 * @param summonerId
	 *            summoner's id
	 * @param season
	 *            the season
	 * @return A map with the league name and the related League object
	 */
	public PlayerStatsSummaryList getPlayerStats(Long summonerId, Season season) {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "stats/by-summoner/" + summonerId + "/summary?season="
				+ season + "&api_key=" + this.apiKey);
		PlayerStatsSummaryList playerStatsSummaryList = new Gson().fromJson(jsonString, PlayerStatsSummaryList.class);

		return playerStatsSummaryList;
	}

	/**
	 * Retrieves ranked stats of summoner with given summoner id and season
	 * 
	 * @param summonerId
	 *            summoner's id
	 * @param season
	 *            season
	 * @return {@link RankedStats} object
	 */
	public RankedStats getRankedStats(Long summonerId, Season season) {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "stats/by-summoner/" + summonerId + "/ranked?season="
				+ season + "&api_key=" + this.apiKey);
		RankedStats rankedStats = new Gson().fromJson(jsonString, RankedStats.class);

		return rankedStats;
	}

	/**
	 * Retrieves teams of summoner with given summoner id
	 * 
	 * @param summonerId
	 *            summoner's id
	 * @return list of {@link Team} objects
	 */
	public List<Team> getTeams(Long summonerId) {
		String jsonString = LeagueAPI
				.request(BASEURL_V2 + "team/by-summoner/" + summonerId + "?api_key=" + this.apiKey);

		Gson gson = new Gson();
		List<Team> teams = gson.fromJson(jsonString, new TypeToken<List<Team>>() {
		}.getType());

		return teams;
	}

	/**
	 * Retrieves mastery pages of summoner with given summoner id
	 * 
	 * @param summonerId
	 *            summoner's id
	 * @return {@link MastersPages} object
	 */
	public MasteryPages getMasteryPages(Long summonerId) {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "summoner/" + summonerId + "/masteries?api_key="
				+ this.apiKey);
		MasteryPages masteryPages = new Gson().fromJson(jsonString, MasteryPages.class);

		return masteryPages;
	}

	/**
	 * Retrieves rune pages of summoner with given summoner id
	 * 
	 * @param summonerId
	 *            summoner's id
	 * @return {@link RunePages} object
	 */
	public RunePages getRunePages(Long summonerId) {
		String jsonString = LeagueAPI.request(BASEURL_V1 + "summoner/" + summonerId + "/runes?api_key=" + this.apiKey);
		RunePages runePages = new Gson().fromJson(jsonString, RunePages.class);

		return runePages;
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
				throw new LeagueAPIException("Error: Empty response.");
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
