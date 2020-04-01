package com.akhudoyarova;

import java.util.HashMap;
import java.util.Map;

public class Board {

    Map<Integer, String> board;;

    Board() {
        this.board = new HashMap<Integer, String>();
//        int i = 0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            this.board.put(entry.getKey(), entry.getValue());
//            ++i;
//        }
    }

    /**
     * delete a number from board after user was serviced
     * @param talonNumber
     */
    public void delete(int talonNumber) {
        this.board.remove(talonNumber);
    }

    /**
     * add new user with his number and status (time for waiting,
     * which will change to window number)
     * @param number
     * @param status
     */
    public void add(int number, String status) {
        this.board.put(number, status); //think about realisation
    }

}
