package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Practice Array
//        //4. Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
        Scanner in = new Scanner(System.in);
//        double num, total = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Enter any number");
//            int input = in.nextInt();
//
//            int[] arrayInput = new int[10];
//
//            total += input;
//        }
//        System.out.println("Average:" + total / 10);
//
//        //5. Create an array to store 3 names, loop through array to print out the names
//
//        String[] names = {"Carina", "Cathy", "Corinne"};
//        for (int index = 0; index < names.length; index++) {
//            System.out.println(names[index]);
//        }

        //6. Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.
        int index = 0;
        int[] list = {2, 5, 9, 0, 2, 1, 8, 5, 4};
        for (index = 0; index < 9; index++) {
            if (list[index] == 5) {
                System.out.println("Value of 5 equals index of: " + index);
            }else {
                System.out.println(list[index]);
            }
        }
    }
}
