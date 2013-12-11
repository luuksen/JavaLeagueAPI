package at.luuk.lolapiwrapper.exception;

import java.util.HashMap;

public class LeagueAPISummonerException extends LeagueAPIException {

	private static final long serialVersionUID = 3732828954228668541L;
	
	@SuppressWarnings("serial")
	private static HashMap<Integer, String> errors = new HashMap<Integer, String>() {
		{
			put(500, "Internal Server Error");
			put(400, "Bad request");
			put(404, "Summoner not found");
		}
	};

	public LeagueAPISummonerException(int errorCode, String message) {
		super("SummonerException " + errorCode + ": " + errors.get(errorCode));
	}

}
