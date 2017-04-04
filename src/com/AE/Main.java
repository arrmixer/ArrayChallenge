package com.AE;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        Integer[] myIntegers = getIntegers(5);
//        for(int i = 0;i<myIntegers.length;i++){
//            System.out.println("The number entered is " + myIntegers[i] + " and it's position is " + i + ".");
//        }
//        Integer[] myIntegers = {3,1,5,50,34,20};
        printArray(myIntegers);
        Arrays.sort(myIntegers, Collections.reverseOrder());
        printArray(myIntegers);










    }

    public static void printArray(Integer[] array){
        for(int i = 0;i<array.length;i++){
            System.out.println("The number entered is " + array[i] + " and it's position is " + i + "." );
        }
    }



    public static Integer[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        Integer[] values = new Integer[number];

        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }
}


