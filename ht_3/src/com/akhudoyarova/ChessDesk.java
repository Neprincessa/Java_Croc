package com.akhudoyarova;

public class ChessDesk {
	private static final char[] ALPHABET = "abcdefgh".toCharArray();
    int x;
    int y;
	

    public ChessDesk(int x, int y) {
		if (x < 0 || x >= 8 || y < 0 || y >= 8) {
			throw new IllegalArgumentException("Invalid coordinates");
		}
       	this.x = x;
       	this.y = y;
    }
	
	
	public ChessDesk(String pos) {
		char[] tmp = pos.toCharArray();

		if (tmp.length != 2){
			throw new IllegalArgumentException("Invalid coordinates");
		}

		if (tmp[0] < 'a' || tmp[0] > 'h')
			throw new IllegalArgumentException("Invalid coordinates");
		this.x = tmp[0] - 'a';

		if (tmp[1] < '1' || tmp[1] > '8') {
			throw new IllegalArgumentException("Invalid coordinates");
		}
		this.y = tmp[1] - '1';
	}
	

    @Override
    public String toString() {
        return ALPHABET[this.x] + String.valueOf(this.y + 1);
    }
}

