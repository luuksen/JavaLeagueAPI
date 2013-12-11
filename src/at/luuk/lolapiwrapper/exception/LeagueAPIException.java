package at.luuk.lolapiwrapper.exception;

/**
 * League of Legends API Exception
 * @author Lukas Greilinger (luukseN @ EUW)
 */
public class LeagueAPIException extends Exception {

	private static final long serialVersionUID = 9163806662591941707L;

	public LeagueAPIException() {
	}

	public LeagueAPIException(String message) {
		super(message);
	}

}