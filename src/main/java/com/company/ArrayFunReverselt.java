package com.company;

import java.util.Arrays;

public class ArrayFunReverselt {

    public static void main(String[] args) {
        int[] startarray = new int[5];
        int[] newarray = new int[5];

        for (int i = 0; i < startarray.length; i++) {
            startarray[i] = i +1;
        }

        for (int i = 0; i < newarray.length; i++) {
            newarray[i] = startarray[4-i];
        }

        System.out.println("Here is the original array:");
        System.out.println(Arrays.toString(startarray));
        System.out.println("Here is the array in reverse order:");
        System.out.println(Arrays.toString(newarray));
    }
}
