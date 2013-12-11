Java League of Legends API Wrapper
====================

JavaLeagueAPI is an object-oriented wrapper for Riot's official League of Legends API released on 11th December, 2013.

Usage
---

Using this wrapper is very simple. You can download the .jar file from github repository in the same folder as this README and include it in you Java project.

To use the wrapper, you have to initialize a `LeagueAPI` object
```java
LeagueAPI api = new LeagueAPI("YOUR-API-KEY-HERE", Region.EUW);
```
This object provides methods to retrieve all the data offered by Riot. As of now the API of Riot is in beta and more data may be available in the future. You can check the <a href="http://developer.riotgames.com/api/methods">full API reference here</a>.

With your `LeagueAPI` object you can retrieve the following methods and all of it's nested object-oriented data:
```java
Summoner getSummoner(String summonerName)
Summoner getSummoner(Long summonerId)
ChampionList getChampionList()
RecentGames getRecentGames(Long summonerId)
Map<String, League> getLeagues(Long summonerId)
PlayerStatsSummaryList getPlayerStats(Long summonerId, Season season)
RankedStats getRankedStats(Long summonerId, Season season)
List<Team> getTeams(Long summonerId)
MasteryPages getMasteryPages(Long summonerId)
RunePages getRunePages(Long summonerId)
```
The object structure was taken over by Riot's API, so you can check their API reference in order to see all the data and where/how you can retrieve it over this wrapper.

Feedback
---

I hope you can use this wrapper or may use it one day. It is completely free to use and you can also edit it. I'd love feedback if and where you used it and also what you would like to be changed.

Feel free to contact me in League of Legends: luukseN @ EUW
