package at.luuk.lolapiwrapper.entity;

import java.util.Set;

public class TeamStatSummary {

	private TeamId teamId;
	private Set<TeamStatDetail> teamStatDetails;
	
	public TeamId getTeamId() {
		return teamId;
	}
	public void setTeamId(TeamId teamId) {
		this.teamId = teamId;
	}
	public Set<TeamStatDetail> getTeamStatDetails() {
		return teamStatDetails;
	}
	public void setTeamStatDetails(Set<TeamStatDetail> teamStatDetails) {
		this.teamStatDetails = teamStatDetails;
	}
	
}
