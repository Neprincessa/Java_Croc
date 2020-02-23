package com.akhudoyarova;
import  java.util.Random;

public class Main {


    public static int[] generateArray(int number) {
        Random random = new Random(System.currentTimeMillis());
        return random.ints(number, 20,150).toArray();
    }


    public static void transferMin(int[] currentArray, int index) {
        while (index > 0) {
            int buf = currentArray[index];
            currentArray[index] = currentArray[index-1];
            currentArray[index-1] = buf;
            index--;
        }
    }


    public static void transferMax(int[] currentArray, int index) {
        while (index < currentArray.length-1) {
            int buf = currentArray[index];
            currentArray[index] = currentArray[index+1];
            currentArray[index+1] = buf;
            index++;
        }
    }


    public static void printArray(int[] currentArray) {
        for(int i = 0; i<currentArray.length; i++)
            System.out.println(currentArray[i]);
    }


    public static void processing(int[] inputArray) {
        
        int min = inputArray[0], max = inputArray[0], indexMax = 0, indexMin = 0;

        for(int i = 0; i < inputArray.length; i++) {
            if (max < inputArray[i]) {
                max = inputArray[i];
                indexMax = i;
            }
            if (min > inputArray[i]) {
                min = inputArray[i];
                indexMin = i;
            }
        }

        if (indexMax < indexMin)
            indexMax++;
        Main.transferMin(inputArray, indexMin);
        Main.transferMax(inputArray, indexMax);
    }


    public static void main(String[] args) {
        int quantity = 20;
        int[] inputArray = Main.generateArray(quantity);

        if (inputArray != null) {
            System.out.println("Input array");
            Main.printArray(inputArray);

            Main.processing(inputArray);

            System.out.println("Result array");
            Main.printArray(inputArray);
        }
        else
            System.out.println("Empty array :(");
    }
}

