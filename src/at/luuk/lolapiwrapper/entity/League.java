package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class League {
	
	private List<LeagueItem> entries;
	private String name;
	private String queue;
	private String tier;
	private Long timestamp;
	
	public List<LeagueItem> getEntries() {
		return entries;
	}
	public void setEntries(List<LeagueItem> entries) {
		this.entries = entries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
}
