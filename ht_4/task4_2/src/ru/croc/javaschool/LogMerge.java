package ru.croc.javaschool;

import java.io.IOException;
import java.io.Writer;

public class LogMerge {

	public static void mergeLogs(Writer w, String... fileNames) throws IOException {
		if (fileNames == null)
			throw new IllegalArgumentException("fileNames cannot be null");

		int n = fileNames.length;
		LogReader[] logReaders = new LogReader[n];
		try {
			for (int i = 0; i < n; i++) {
				logReaders[i] = new LogReader(fileNames[i]);
			}

			while (true) {
				LogEntry min = null;
				LogReader minReader = null;
				for (LogReader logReader : logReaders) {
					LogEntry entry = logReader.getCurrentEntry();
					if (entry != null) {
						if (min == null || entry.getTime() < min.getTime()) {
							min = entry;
							minReader = logReader;
						}
					}
				}
				if (min == null) // all read
					break;
				w.write(min.toString());
				w.write("\n");
				minReader.readNextEntry();
			}
		} finally {
			for (LogReader logReader : logReaders) {
				if (logReader == null)
					continue;
				try {
					logReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
