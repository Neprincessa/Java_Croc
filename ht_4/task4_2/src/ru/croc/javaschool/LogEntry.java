package ru.croc.javaschool;

public class LogEntry {

	private final long time;

	private final String message;

	public LogEntry(long time, String message) {
		this.time = time;
		this.message = message;
	}

	public static LogEntry parse(String str) {
		if (str == null)
			return null;
		String[] tokens = str.split(" ", 2);
		return new LogEntry(
				Long.parseLong(tokens[0]),
				tokens.length > 1 ? tokens[1] : "");
	}

	public long getTime() {
		return time;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return time + " " + message;
	}
}
