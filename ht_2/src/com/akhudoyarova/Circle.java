package com.akhudoyarova;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Scanner;

public class Circle extends Figure implements Moveable{

    int x;
    int y;
    int radius;

    Circle( int axis, int ordinate, int radius){
        if (radius < 0)
            throw new IllegalArgumentException("Enter positive radius");
        this.x = axis;
        this.y = ordinate;
        this.radius = radius;
    }

    @Override
    public void printFigure() {
        System.out.println("Circle with center in: (" + this.x + ',' + this.y + ')');
        System.out.println("Radius: " + this.radius);
    }

    @Override
    public boolean find(int x, int y) {
        int distance = (int)(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        if (distance <= (int)Math.pow(this.radius, 2))
            return true;
        return false;
    }


    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}