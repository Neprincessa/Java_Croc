package com.akhudoyarova.figures;

public abstract class Figure implements Moveable {

    public Figure() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract boolean find(int x, int y);
}

