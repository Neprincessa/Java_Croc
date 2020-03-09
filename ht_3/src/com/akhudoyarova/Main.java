package com.akhudoyarova;

import com.akhudoyarova.except.IllegalMoveException;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
	
	public static String check(ChessDesk[] coordinates) throws IllegalMoveException {
		for(int i = 0; i < coordinates.length - 1; i++) {
			if (!((abs(coordinates[i + 1].x - coordinates[i].x) == 2 && abs(coordinates[i + 1].y - coordinates[i].y) == 1)
					|| (abs(coordinates[i + 1].x - coordinates[i].x) == 1 && abs(coordinates[i + 1].y - coordinates[i].y) == 2))){
				throw new IllegalMoveException("Конь так не ходит:", coordinates[i].toString(), coordinates[i + 1].toString());
			}
		}
		return "OK";
	}


    public static void main(String[] args) throws IllegalMoveException {
       	System.out.println("Enter amount of points");
       	Scanner sc = new Scanner(System.in);
       	int number = sc.nextInt();

		System.out.println("Enter coordinates");
		Scanner scStr= new Scanner(System.in);
		String curPoints = scStr.nextLine();
		String[] splitStr = curPoints.trim().split("\\s+");

		if(splitStr.length != number){
			throw new IllegalArgumentException("Amount of movements error");
		}

		ChessDesk[] points = new ChessDesk[number];
		for (int i = 0; i < number; i++) {
			points[i] = new ChessDesk(splitStr[i]);
		}
		
		System.out.println(check(points));
    }
}
