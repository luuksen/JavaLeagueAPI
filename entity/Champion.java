package at.luuk.lolapiwrapper.entity;

public class Champion {

	private boolean active;
	private int attackRank;
	private boolean botEnabled;
	private boolean botMmEnabled;
	private int defenseRank;
	private int difficutlyRank;
	private boolean freeToPlay;
	private Long id;
	private int magicRank;
	private String name;
	private boolean rankedPlayEnabled;
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getAttackRank() {
		return attackRank;
	}
	public void setAttackRank(int attackRank) {
		this.attackRank = attackRank;
	}
	public boolean isBotEnabled() {
		return botEnabled;
	}
	public void setBotEnabled(boolean botEnabled) {
		this.botEnabled = botEnabled;
	}
	public boolean isBotMmEnabled() {
		return botMmEnabled;
	}
	public void setBotMmEnabled(boolean botMmEnabled) {
		this.botMmEnabled = botMmEnabled;
	}
	public int getDefenseRank() {
		return defenseRank;
	}
	public void setDefenseRank(int defenseRank) {
		this.defenseRank = defenseRank;
	}
	public int getDifficutlyRank() {
		return difficutlyRank;
	}
	public void setDifficutlyRank(int difficutlyRank) {
		this.difficutlyRank = difficutlyRank;
	}
	public boolean isFreeToPlay() {
		return freeToPlay;
	}
	public void setFreeToPlay(boolean freeToPlay) {
		this.freeToPlay = freeToPlay;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getMagicRank() {
		return magicRank;
	}
	public void setMagicRank(int magicRank) {
		this.magicRank = magicRank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isRankedPlayEnabled() {
		return rankedPlayEnabled;
	}
	public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
		this.rankedPlayEnabled = rankedPlayEnabled;
	}
	
	
	
}
