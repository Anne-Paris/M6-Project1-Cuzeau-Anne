package com.company;

import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {
        String[] stringarray_user = new String[5];
        Scanner inputread = new Scanner(System.in);
        String current_word;

        for (int i = 0; i < stringarray_user.length; i++) {
            System.out.println("Please enter a word: ");
            current_word = inputread.nextLine();

            while (current_word.contains(" ")){
                System.out.println("You entered more than one word (or a word and a space), please try again: ");
                current_word = inputread.nextLine();
            }
            stringarray_user[i] = current_word;
        }

        System.out.println("Here are the 5 words you entered:");
        for (int i = 0; i < stringarray_user.length; i++) {
            System.out.printf(stringarray_user[i] + " ");
        }
    }
}
