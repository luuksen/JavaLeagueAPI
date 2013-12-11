package at.luuk.lolapiwrapper.entity;

public class MiniSeries {
	
	private int losses;
	private String progress;
	private int target;
	private Long timeLeftToPlayMillis;
	private int wins;
	
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public Long getTimeLeftToPlayMillis() {
		return timeLeftToPlayMillis;
	}
	public void setTimeLeftToPlayMillis(Long timeLeftToPlayMillis) {
		this.timeLeftToPlayMillis = timeLeftToPlayMillis;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	
	
}
