package com.akhudoyarova.figures;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class BoundingBox extends Figure implements Moveable {

    int xLeft;
    int yLeft;
    int xRight;
    int yRight;

    public BoundingBox( int axisLeft, int ordinateLeft, int axisRight, int ordinateRight){
        if ( axisLeft > axisRight || ordinateLeft > ordinateRight)
            throw new ValueException("Incorrect coordinates. Left axis and ordinate should be less than right");
        this.xLeft = axisLeft;
        this.yLeft = ordinateLeft;
        this.xRight = axisRight;
        this.yRight = ordinateRight;
    }

    @Override
    public boolean find(int x, int y) {
        if (this.xLeft <= x & this.xRight >= x & this.yLeft <= y & this.yRight >= y)
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

    @Override
    public String toString() {
        return "Coordinate of box: (" + this.xLeft + ',' + this.yLeft
                + ')' + " and (" + this.xRight + ',' + this.yRight + ')';
    }
}
