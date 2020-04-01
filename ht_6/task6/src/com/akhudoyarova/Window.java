package com.akhudoyarova;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Window {
    String[] modes;
    int number;
    boolean callClient;

    /**
     * fix types of functions that user can get in current window, number of window
     * and is it available to call a client
     * @param call
     * @param number
     * @param currentModes
    **/
    Window(boolean call, int number, String... currentModes){
        for (int i = 0; i < currentModes.length; i++) {
            this.modes[i] = currentModes[i];
        }
        this.callClient = false;
        this.number = number;
    }

    /**
     * mark the window: free or busy
     * @param status
     */
    public void upgradeStatus(boolean status) {
        this.callClient = status;
    }

    /**
     * show what this window do in current moment
     */
    public void showOptions() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("k:mm");
        String[] tmp =  formatForDateNow.format(dateNow).toString().split(":");
        int[] data = new int[2];
        for (int i = 0; i < tmp.length; i++) {
            data[i] = Integer.parseInt(tmp[i]);
        }
        System.out.println("Available options for window №"+Integer.toString(this.number));
        if (data[0] > 12) {
            System.out.println("Get documents");
        }
        else {
            for (int i = 0; i < this.modes.length; i++){
                System.out.println(this.modes[i]);
            }
        }
    }
}
