package com.akhudoyarova;
import  java.util.Random;

public class Main {


    public static int[] generate_array(int number) {
        Random random = new Random(System.currentTimeMillis());
        return random.ints(number, 20,150).toArray();
    }


    public static void transfer_min(int[] current_array, int index) {
        while (index > 0) {
            int buf = current_array[index];
            current_array[index] = current_array[index-1];
            current_array[index-1] = buf;
            index--;
        }
    }


    public static void transfer_max(int[] current_array, int index) {
        while (index < current_array.length-1) {
            int buf = current_array[index];
            current_array[index] = current_array[index+1];
            current_array[index+1] = buf;
            index++;
        }
    }


    public static void print_array(int[] current_array) {
        for(int i = 0; i<current_array.length; i++)
            System.out.println(current_array[i]);
    }

    public static void main(String[] args) {
        int quantity = 20;
        int[] input_array = Main.generate_array(quantity);

        System.out.println("Input array");
        Main.print_array(input_array);

        int min = input_array[0], max = input_array[0], index_max = 0, index_min = 0;

        for(int i = 0; i < input_array.length; i++) {
            if (max < input_array[i]) {
                max = input_array[i];
                index_max = i;
            }
            if (min > input_array[i]) {
                min = input_array[i];
                index_min = i;
            }
        }

        if (index_max < index_min)
            index_max++;
        Main.transfer_min(input_array, index_min);
        Main.transfer_max(input_array, index_max);

        System.out.println("Result array");
        Main.print_array(input_array);
    }
}
