package com.company;

import java.util.Scanner;

//Author: Anne Cuzeau

public class MonthConverterSwitch {

    //Method getMonth take the input as an int and returns the month name
    public static String getMonth(int monthInt) {
        String[] monthsArray = {"January","February","March","April","May","June","July",
                "August","September","October","November","December"};
        return monthsArray[monthInt-1];
    }

    public static void main(String[] args) {
        // Call scanner to read input
        Scanner scanner = new Scanner(System.in);

        //Greet user and print instructions
        System.out.println("Please enter a number between 1 and 12:");

        //Get input as an integer
        int monthInt = Integer.parseInt(scanner.nextLine());

        //Succession of switch statements with a print statement based on the integer entered. Each case has a similar statement
        // since they all use the method getMonth.
        switch(monthInt){
            default: System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
                break;
            case 1:  System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 2:  System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 3:  System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 4: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 5: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 6: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 7: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 8: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 9: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 10: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 11: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;
            case 12: System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, getMonth(monthInt));
                break;

        }
    }

}
