package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class Roster {

	private List<TeamMemberInfo> memberList;
	private Long ownerId;
	
	public List<TeamMemberInfo> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<TeamMemberInfo> memberList) {
		this.memberList = memberList;
	}
	public Long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	
}
