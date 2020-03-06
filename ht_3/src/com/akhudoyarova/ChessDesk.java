package com.akhudoyarova;

public class ChessDesk {

    int x;
    int y;

    public ChessDesk(int x, int y) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8)
            throw new IllegalArgumentException("Invalid coordinates");
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String alph = "abcdefgh";
        char[] alphabet = alph.toCharArray();
        return String.valueOf(alphabet[this.x]) + String.valueOf(this.y + 1);
    }
}
