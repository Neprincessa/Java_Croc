package com.akhudoyarova.except;

public class IllegalMoveException extends Exception {
    public  IllegalMoveException(String message, String first_cell, String second_cell) {
        super(message + " " + first_cell + " -> " + second_cell);
    }
}
