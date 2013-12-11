package at.luuk.lolapiwrapper.entity;

import java.util.Set;

public class RunePages {

	private Set<RunePage> pages;
	private Long summonerId;
	
	public Set<RunePage> getPages() {
		return pages;
	}
	public void setPages(Set<RunePage> pages) {
		this.pages = pages;
	}
	public Long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(Long summonerId) {
		this.summonerId = summonerId;
	}
	
}
