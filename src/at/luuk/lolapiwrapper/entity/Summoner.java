package at.luuk.lolapiwrapper.entity;

public class Summoner {
	
	private Long id;
	private String name;
	private int profileIconId;
	private Long revisionDate;
	private String revisionDateStr;
	private Long summonerLevel;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getProfileIconId() {
		return profileIconId;
	}
	
	public void setProfileIconId(int profileIconId) {
		this.profileIconId = profileIconId;
	}
	
	public Long getRevisionDate() {
		return revisionDate;
	}
	
	public void setRevisionDate(Long revisionDate) {
		this.revisionDate = revisionDate;
	}
	
	public String getRevisionDateStr() {
		return revisionDateStr;
	}
	
	public void setRevisionDateStr(String revisionDateStr) {
		this.revisionDateStr = revisionDateStr;
	}
	
	public Long getSummonerLevel() {
		return summonerLevel;
	}
	
	public void setSummonerLevel(Long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}
}
