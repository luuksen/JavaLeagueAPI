package at.luuk.lolapiwrapper.exception;

/**
 * League of Legends API Exception
 * 
 * @author Lukas Greilinger (luukseN @ EUW)
 */
public class LeagueAPIException extends Exception {

	private static final long serialVersionUID = 9163806662591941707L;
	public static final int ERROR_API_KEY_LIMIT = 429;
	public static final int ERROR_API_KEY_WRONG = 401;

	public LeagueAPIException() {
	}

	public LeagueAPIException(String message) {
		super(message);
	}

	public LeagueAPIException(int code) {
		super("Error " + code + ": " + getError(code));
	}

	private static String getError(int code) {
		switch (code) {
		case ERROR_API_KEY_LIMIT:
			return "API Limit reached";
		case ERROR_API_KEY_WRONG:
			return "Not authorized: Maybe your API key is wrong";
		}
		return null;
	}

}