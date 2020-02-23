package com.akhudoyarova;
import java.util.Locale;
import java.util.Scanner;

public class Main {


	public static void printBytes(long volume) {
		int counter = 0;
		float resultVolume = volume;
		String unit = "";
		while ( resultVolume >= 1024) {
			resultVolume = resultVolume / 1024;
			counter++;
		}
		unit = Main.changeUnit(counter);
		System.out.println(String.format(Locale.US, "Result volume: %.1f %s", resultVolume,unit));
	}


	public static String changeUnit(int number) {
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
		if (number == 6)
			unit = "EB";
		return unit;
	}


    public static void main(String[] args) {
	    int divisor = 1024;
	    System.out.println("Fill in your volume of data:");
	    Scanner sc = new Scanner(System.in);
	    long inputVolume = sc.nextLong();
	    Main.printBytes(inputVolume);
    }
}

