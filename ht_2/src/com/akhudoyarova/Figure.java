package com.akhudoyarova;

import java.util.DoubleSummaryStatistics;

abstract class Figure implements Moveable{

    Figure() {
    }

    public abstract void printFigure();
    public abstract boolean find(int x, int y);
}

