package com.akhudoyarova;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    static String vowelStr = "aeiouyAEIOUY";

    public static boolean isVowel(char character){
        return vowelStr.contains(String.valueOf(character));
    }

    public static String TurnAround(String original){
        StringBuilder result = new StringBuilder();
        StringBuilder vowels = getVowelsFromString(original);
        int i = 0;
        for(char c : original.toCharArray()){
            if(isVowel(c)){
                result.append(vowels.charAt(i));
                i++;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static StringBuilder getVowelsFromString(String original) {
        StringBuilder result = new StringBuilder();
        for(char c : original.toCharArray()){
            if (isVowel(c)){
                result.append(c);
            }
        }
        return result.reverse();
    }
}