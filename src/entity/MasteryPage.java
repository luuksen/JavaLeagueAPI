package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class MasteryPage {

	private boolean current;
	private String name;
	private List<Talent> talents;
	
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Talent> getTalents() {
		return talents;
	}
	public void setTalents(List<Talent> talents) {
		this.talents = talents;
	}
	
}
