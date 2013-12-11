package at.luuk.lolapiwrapper.entity;

import java.util.List;

public class RunePage {

	private boolean current;
	private Long id;
	private String name;
	private List<RuneSlot> slots;
	
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
	}
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
	public List<RuneSlot> getSlots() {
		return slots;
	}
	public void setSlots(List<RuneSlot> slots) {
		this.slots = slots;
	}
	
}
