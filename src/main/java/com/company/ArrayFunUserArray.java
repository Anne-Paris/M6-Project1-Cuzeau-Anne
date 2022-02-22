package com.company;

import java.util.Scanner;

//Author: Anne Cuzeau
public class ArrayFunUserArray {

    public static void main(String[] args) {
        // Call scanner to read input
        Scanner inputread = new Scanner(System.in);

        //Instantiate one array for integers and one string
        int[] inputarray = new int[5];
        String userinput;

        for (int i = 0; i < inputarray.length; i++) {
            //Greet user and print instructions
            System.out.println("Please enter an integer:");

            //Get input as integer, then put input in the array at index i
            userinput = inputread.nextLine();
            inputarray[i] = Integer.parseInt(userinput);
        }

        //Thank user
        System.out.println("Thank you! Here are the numbers you entered: ");

        //Print array in one line
        for (int i = 0; i < inputarray.length; i++) {
            System.out.print(inputarray[i] + " ");
        }

    }
}
