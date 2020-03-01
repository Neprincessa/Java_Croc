package com.akhudoyarova;

import javafx.scene.shape.Polygon;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class BoundingBox extends Figure implements Moveable{

    int xLeft;
    int yLeft;
    int xRight;
    int yRight;

    BoundingBox( int axisLeft, int ordinateLeft, int axisRight, int ordinateRight){
        if ( axisLeft > axisRight || ordinateLeft > ordinateRight)
            throw new ValueException("Incorrect coordinates. Left axis and ordinate should be less than right");
        this.xLeft = axisLeft;
        this.yLeft = ordinateLeft;
        this.xRight = axisRight;
        this.yRight = ordinateRight;
    }

    @Override
    public void printFigure(){
        System.out.println("Coordinate of box: (" + this.xLeft + ',' + this.yLeft
                + ')' + " and (" + this.xRight + ',' + this.yRight + ')');
    }

    private int check(int Px, int Py, int Ax, int Ay, int Bx, int By) {
        return (Bx - Ax) * (Py - Ay) - (By - Ay) * (Px - Ax);
    }

    @Override
    public boolean find(int x, int y) {
        int nPoints = 4;
        int[] points = new int[2*nPoints];
        points[0] = this.xLeft;
        points[1] = this.yLeft;
        points[2] = this.xRight;
        points[3] = this.yLeft;
        points[4] = this.xRight;
        points[5] = this.yRight;
        points[6] = this.xLeft;
        points[7] = this.yRight;


        int p1 = check(x,y, points[0],points[1], points[2], points[3]);
        int p2 = check(x,y, points[2], points[3], points[4], points[5]);
        int p3 = check(x,y, points[4], points[5],points[6],points[7]);
        int p4 = check(x,y, points[6],points[7],points[0], points[1]);

        if (p1 < 0 & p2 < 0 & p3 < 0 & p4 < 0 || p1 > 0 & p2 > 0 & p3 > 0 & p4 > 0)
            return true;
        return false;
    }

    @Override
    public void move(int dx, int dy) {
        this.xRight += dx;
        this.xLeft += dx;
        this.yRight += dy;
        this.yLeft += dy;
    }
}
