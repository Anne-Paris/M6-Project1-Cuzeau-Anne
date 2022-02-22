package com.company;

import java.util.Scanner;

//Author: Anne Cuzeau
public class ArrayFun5Words {

    public static void main(String[] args) {
        //Instantiate one array holding strings to hold user's input
        String[] stringarray_user = new String[5];

        // Call scanner to read input
        Scanner inputread = new Scanner(System.in);

        //Create variable to hold one word when going through the array
        String current_word;

        //For loop to ask for user's input 5 times
        for (int i = 0; i < stringarray_user.length; i++) {
            System.out.println("Please enter a word: ");

            //get input
            current_word = inputread.nextLine();

            //If input includes a space, reject and ask again
            while (current_word.contains(" ")){
                System.out.println("You entered more than one word (or a word and a space), please try again: ");
                current_word = inputread.nextLine();
            }

            //Put the word typed into an array at index i
            stringarray_user[i] = current_word;
        }

        //Print array on one line
        System.out.println("Here are the 5 words you entered:");
        for (int i = 0; i < stringarray_user.length; i++) {
            System.out.printf(stringarray_user[i] + " ");
        }
    }
}
