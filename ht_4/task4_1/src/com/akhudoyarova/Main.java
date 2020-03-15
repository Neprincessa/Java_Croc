package com.akhudoyarova;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static  int count_words(String filepath)  {
        int amount = 0;
        try (BufferedReader r = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ( (line = r.readLine()) != null) {
                if (!(line.trim().isEmpty())) {
                    amount += line.trim().split(" +").length;
                }
            }
        } catch (IOException e) {
            System.out.println("Invalid path!");
            e.printStackTrace();
        }
        return amount;
    }


    public static void main(String[] args) {
        int amount_of_words = 0;
        try {
            amount_of_words = count_words(args[0]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("No arguments");
        }

        System.out.println("Amount of words: " + amount_of_words);
    }
}