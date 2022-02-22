package com.company;

import java.util.Arrays;

//Author: Anne Cuzeau
public class ArrayFunReverselt {

    public static void main(String[] args) {

        //Instantiate two array of the same length and holding the same type (integers)
        int[] startarray = new int[5];
        int[] newarray = new int[5];

        //For loop to populate first array with 1,2,3,4,5
        for (int i = 0; i < startarray.length; i++) {
            startarray[i] = i +1;
        }

        //Populate array #2 with values of array #1 in reverse
        for (int i = 0; i < newarray.length; i++) {
            newarray[i] = startarray[4-i];
        }

        //Print both arrays using the Arrays.toString method
        System.out.println("Here is the original array:");
        System.out.println(Arrays.toString(startarray));
        System.out.println("Here is the array in reverse order:");
        System.out.println(Arrays.toString(newarray));
    }
}
