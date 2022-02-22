package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {
        Scanner inputread = new Scanner(System.in);
        int[] inputarray = new int[5];
        String userinput;

        for (int i = 0; i < inputarray.length; i++) {
            System.out.println("Please enter an integer:");
            userinput = inputread.nextLine();
            inputarray[i] = Integer.parseInt(userinput);
        }

        System.out.println("Thank you! Here are the numbers you entered: ");

        for (int i = 0; i < inputarray.length; i++) {
            System.out.print(inputarray[i] + " ");
        }

    }
}
