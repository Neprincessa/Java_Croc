package ru.croc.javaschool;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Usage:");
            System.err.println("main path1 [pathN]");
            System.exit(1);
        }

        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        LogMerge.mergeLogs(
                w,
                args);
        w.flush();
    }
}
