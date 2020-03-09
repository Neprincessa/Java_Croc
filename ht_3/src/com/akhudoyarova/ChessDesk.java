package com.akhudoyarova;

public class ChessDesk {

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
		String alph = "abcdefgh";
       	char[] alphabet = alph.toCharArray();
		char[] tmp = pos.toCharArray();

		if (tmp.length != 2){
			throw new IllegalArgumentException("Invalid coordinates");
		}
		
		boolean flag = false;
		for (int i = 0; i < alphabet.length; i++) {
			if (tmp[0] == alphabet[i]) {
				flag = true;
				this.x = i;
			}
		}
		if (!flag) {
			throw new IllegalArgumentException("Invalid coordinates");
		}
		if (tmp[1] < '1' || tmp[1] > '8') {
			throw new IllegalArgumentException("Invalid coordinates");
		}
		this.y = tmp[1] - '1';
	}
	

    @Override
    public String toString() {
		String alph = "abcdefgh";
		char[] alphabet = alph.toCharArray();
        return alphabet[this.x] + String.valueOf(this.y + 1);
    }
}
