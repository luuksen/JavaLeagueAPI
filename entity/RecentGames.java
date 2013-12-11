package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class RecentGames {
	
	private Long summonerId;
	private List<Game> games;
	
	public Long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(Long summonerId) {
		this.summonerId = summonerId;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	
}
