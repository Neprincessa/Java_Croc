package ru.croc.javaschool;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LogReader implements Closeable {

	private BufferedReader r;

	private LogEntry currentEntry;

	public LogReader(String fileName) throws IOException {
		r = new BufferedReader(new InputStreamReader(
				Files.newInputStream(Paths.get(fileName))));
		readNextEntry();
	}

	public LogEntry getCurrentEntry() {
		return currentEntry;
	}

	public void readNextEntry() throws IOException {
		String line = r.readLine();
		currentEntry = line == null
				? null
				: LogEntry.parse(line);
	}

	@Override
	public void close() throws IOException {
		r.close();
	}
}
