package com.akhudoyarova;

import com.akhudoyarova.figures.Figure;

public class Annotation {
    public String info;
    public Figure figure;

    public Annotation(String info, Figure figure) {
        this.info = info;
        this.figure = figure;
    }

    @Override
    public String toString() {
        return this.figure.toString() + "\n" + "Info about figure: " + this.info;
    }
}
