package com.akhudoyarova;

import com.akhudoyarova.figures.BoundingBox;
import com.akhudoyarova.figures.Circle;
import com.akhudoyarova.figures.Figure;

import java.util.Scanner;

public class Main {

    public static Annotation[] make_list(int amount){
        Annotation[] annot = new Annotation[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter 1 if you want to create a box or 2 if you want to create a circle ");
            Scanner sc = new Scanner(System.in);
            if (sc.nextInt() == 1) {
                System.out.println("Enter x1,y1,x2,y2");
                Scanner coordinates_box = new Scanner(System.in);
                Figure figure = new BoundingBox(coordinates_box.nextInt(), coordinates_box.nextInt(),
                        coordinates_box.nextInt(), coordinates_box.nextInt());
                annot[i] = new Annotation("figure" + Integer.toString(i+1), figure );
            }
            else {
                System.out.println("Enter x1,y1,radius");
                Scanner coordinates_box = new Scanner(System.in);
                Figure figure = new Circle(coordinates_box.nextInt(), coordinates_box.nextInt(),
                        coordinates_box.nextInt());
                annot[i] = new Annotation("figure" + Integer.toString(i+1), figure );
            }
        }
        return annot;
    }

    public static Annotation findByPoint(Annotation[] annotations, int x, int y) {
        for (int i = 0; i < annotations.length; i++) {
            boolean flag = annotations[i].figure.find(x,y);
            if (flag) {
                return annotations[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Enter amount");
        Scanner amount = new Scanner(System.in);
        int current_amount = amount.nextInt();
        Annotation[] annotations = make_list(current_amount);

        System.out.println("annotations");
	    for(int i = 0; i < annotations.length; i++) {
            System.out.println(annotations[i]);
            System.out.println("\n");
        }

        System.out.println("Enter x and y of point you want to find");
        int[] parametr = new int[2];
        Scanner sc = new Scanner(System.in);
        parametr[0] = sc.nextInt();
        parametr[1] = sc.nextInt();

        System.out.println("\n");
        Annotation result = findByPoint(annotations, parametr[0],parametr[1]);
        if (result != null)
            System.out.println(result);
        else
            System.out.println("Element not found");


        System.out.println("Enter index of element you want to move");
        Scanner moveFigIndex = new Scanner(System.in);
        int index = moveFigIndex.nextInt();
        while (index > current_amount) {
            System.out.println("Enter less than " + current_amount);
            index = new Scanner(System.in).nextInt();
        }
        System.out.println("Enter dx, dy");
        Scanner move_coordinate = new Scanner(System.in);
        int axis = move_coordinate.nextInt();
        int ord = move_coordinate.nextInt();
        annotations[index-1].figure.move(axis,ord);
    }
}
