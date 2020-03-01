package com.akhudoyarova.figures;

public class Circle extends Figure implements Moveable {

    int x;
    int y;
    int radius;

    public Circle( int axis, int ordinate, int radius){
        if (radius < 0)
            throw new IllegalArgumentException("Enter positive radius");
        this.x = axis;
        this.y = ordinate;
        this.radius = radius;
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

    @Override
    public String toString() {
        return "Circle:" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius;
    }
}