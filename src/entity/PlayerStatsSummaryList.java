package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class PlayerStatsSummaryList {

	private List<PlayerStatsSummary> playerStatSummaries;
	private Long summonerId;
	
	public List<PlayerStatsSummary> getPlayerStatSummaries() {
		return playerStatSummaries;
	}
	public void setPlayerStatSummaries(List<PlayerStatsSummary> playerStatSummaries) {
		this.playerStatSummaries = playerStatSummaries;
	}
	public Long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(Long summonerId) {
		this.summonerId = summonerId;
	}
	
}
