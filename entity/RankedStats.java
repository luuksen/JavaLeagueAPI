package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class RankedStats {

	private List<ChampionStats> champions;
	private Long modifyDate;
	private String modifyDateStr;
	private Long summonerId;
	
	public List<ChampionStats> getChampions() {
		return champions;
	}
	public void setChampions(List<ChampionStats> champions) {
		this.champions = champions;
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
	public Long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(Long summonerId) {
		this.summonerId = summonerId;
	}
	
}
