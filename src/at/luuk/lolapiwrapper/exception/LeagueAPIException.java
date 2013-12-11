package at.luuk.lolapiwrapper.exception;

public class LeagueAPIException extends Exception {

	public enum ExceptionType {
		SUMMONER;
	}

	public LeagueAPIException() {

	}

	public LeagueAPIException(String message) {
		super(message);
	}

}
