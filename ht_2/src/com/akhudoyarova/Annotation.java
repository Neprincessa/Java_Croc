package com.akhudoyarova;

public class Annotation {
    String info;
    Figure figure;

    Annotation(String info, Figure figure) {
        this.info = info;
        this.figure = figure;
    }

    public void print(){
        this.figure.printFigure();
        System.out.println("Info about figure: " + this.info );
    }
}
