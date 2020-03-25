package com.akhudoyarova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String original = inp.nextLine();
        System.out.println(Palindrome.TurnAround(original));
    }
}