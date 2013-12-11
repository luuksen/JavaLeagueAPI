package at.luuk.lolapiwrapper.entity;

public class MatchHistorySummary {

	private int assists;
	private String date;
	private int deaths;
	private Long gameId;
	private String gameMode;
	private boolean invalid;
	private int kills;
	private int mapId;
	private int opposingTeamKills;
	private String opposingTeamName;
	private boolean win;
	
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
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
	public boolean isInvalid() {
		return invalid;
	}
	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public int getMapId() {
		return mapId;
	}
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	public int getOpposingTeamKills() {
		return opposingTeamKills;
	}
	public void setOpposingTeamKills(int opposingTeamKills) {
		this.opposingTeamKills = opposingTeamKills;
	}
	public String getOpposingTeamName() {
		return opposingTeamName;
	}
	public void setOpposingTeamName(String opposingTeamName) {
		this.opposingTeamName = opposingTeamName;
	}
	public boolean isWin() {
		return win;
	}
	public void setWin(boolean win) {
		this.win = win;
	}
	
	
}
