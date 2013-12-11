package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class Game {
	
	private int championId;
	private Long createDate;
	private String createDateStr;
	private List<Player> fellowPlayers;
	private Long gameId;
	private String gameMode;
	private String gameType;
	private boolean invalid;
	private int level;
	private int mapId;
	private int spell1;
	private int spell2;
	private List<RawStat> statistics;
	private String subType;
	private int teamId;
	
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public Long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}
	public String getCreateDateStr() {
		return createDateStr;
	}
	public void setCreateDateStr(String createDateStr) {
		this.createDateStr = createDateStr;
	}
	public List<Player> getFellowPlayers() {
		return fellowPlayers;
	}
	public void setFellowPlayers(List<Player> fellowPlayers) {
		this.fellowPlayers = fellowPlayers;
	}
	public Long getGameId() {
		return gameId;
	}
	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
	public String getGameMode() {
		return gameMode;
	}
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public boolean isInvalid() {
		return invalid;
	}
	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMapId() {
		return mapId;
	}
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	public int getSpell1() {
		return spell1;
	}
	public void setSpell1(int spell1) {
		this.spell1 = spell1;
	}
	public int getSpell2() {
		return spell2;
	}
	public void setSpell2(int spell2) {
		this.spell2 = spell2;
	}
	public List<RawStat> getStatistics() {
		return statistics;
	}
	public void setStatistics(List<RawStat> statistics) {
		this.statistics = statistics;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	
}
