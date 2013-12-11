package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class MasteryPages {
	
	private List<MasteryPage> pages;
	private Long summonerId;
	
	public List<MasteryPage> getPages() {
		return pages;
	}
	public void setPages(List<MasteryPage> pages) {
		this.pages = pages;
	}
	public Long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(Long summonerId) {
		this.summonerId = summonerId;
	}
	
}
