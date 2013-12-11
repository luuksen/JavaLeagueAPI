package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class ChampionStats {

	private int id;
	private String name;
	private List<ChampionStat> stats;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ChampionStat> getStats() {
		return stats;
	}
	public void setStats(List<ChampionStat> stats) {
		this.stats = stats;
	}
	
}
