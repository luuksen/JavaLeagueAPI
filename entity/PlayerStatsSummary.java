package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class PlayerStatsSummary {

	private List<AggregatedStat> aggregatedStats;
	private int losses;
	private Long modifyDate;
	private String modifyDateStr;
	private String playerStatSummaryType;
	private int wins;
	
	public List<AggregatedStat> getAggregatedStats() {
		return aggregatedStats;
	}
	public void setAggregatedStats(List<AggregatedStat> aggregatedStats) {
		this.aggregatedStats = aggregatedStats;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public Long getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Long modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyDateStr() {
		return modifyDateStr;
	}
	public void setModifyDateStr(String modifyDateStr) {
		this.modifyDateStr = modifyDateStr;
	}
	public String getPlayerStatSummaryType() {
		return playerStatSummaryType;
	}
	public void setPlayerStatSummaryType(String playerStatSummaryType) {
		this.playerStatSummaryType = playerStatSummaryType;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	
}
