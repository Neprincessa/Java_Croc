package com.akhudoyarova;
import javax.security.auth.login.AccountException;
import java.util.Locale;
import java.util.Scanner;

public class Main {


	public static void print_bytes(long volume) {
		int counter = 0;
		float result_volume = volume;
		String unit = "";
		while ( result_volume >= 1024) {
			result_volume = result_volume / 1024;
			counter++;
		}
		unit = Main.change_unit(counter);
		System.out.println(String.format(Locale.US, "Result volume: %.1f %s", result_volume,unit));
	}


	public static String change_unit(int number) {
		String unit = "";
		if (number == 0)
			unit = "B";
		if (number == 1)
			unit = "KB";
		if (number == 2)
			unit = "MB";
		if (number == 3)
			unit = "GB";
		if (number == 4)
			unit = "TB";
		if (number == 5)
			unit = "PB";
		return unit;
	}


    public static void main(String[] args) {
	    int divisor = 1024;
	    System.out.println("Fill in your volume of data:");
	    Scanner sc = new Scanner(System.in);
	    long input_volume = sc.nextLong();
	    Main.print_bytes(input_volume);
    }
}
