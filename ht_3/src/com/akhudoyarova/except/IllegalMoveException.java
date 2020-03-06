package com.akhudoyarova.except;

public class IllegalMoveException extends Exception {
    public String correct_cell;
    public String wrong_cell;
    public  IllegalMoveException(String message, String c_cell, String w_cell) {
        super(message + " " + w_cell + " -> " + c_cell);
    }
}
