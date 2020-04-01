package com.akhudoyarova;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Window implements Update{
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
    Window(boolean call, int number, String... currentModes){}

    /**
     * mark the window: free or busy
     * @param status
     */
    public void updateStatus(boolean status) {}

    /**
     * show what this window do in current moment
     */
    public void showOptions() {}

    @Override
    public void update() {}
}
