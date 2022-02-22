package com.company;

import java.util.Scanner;

//Author: Anne Cuzeau

public class MonthConverterIf {
    /*
    //I know the point of this exercise was to practice if/else statements, but here is a
    //method I first wrote that would just work in the main with a call getMonth(monthInt)
    public static void getMsg(int monthInt) {
        String msg;
        String[] monthsArray = {"January","February","March","April","May","June","July",
                "August","September","October","November","December"};

        System.out.format("You have entered %s, which corresponds to %s. Thank you!", monthInt, monthsArray[monthInt-1]);

    } */

    public static void main(String[] args) {
        // Call scanner to read input
        Scanner scanner = new Scanner(System.in);

        //Greet user and print instructions
        System.out.println("Please enter a number between 1 and 12:");

        //Get input as an integer
        int monthInt = Integer.parseInt(scanner.nextLine());

        //Succession of if/else statements with a print statement based on the integer entered.
        if (monthInt == 1){
            System.out.format("You have entered %s, which corresponds to January. Thank you!", monthInt);
        }

        else if (monthInt == 2){
            System.out.format("You have entered %s, which corresponds to February. Thank you!", monthInt);
        }

        else if (monthInt == 3){
            System.out.format("You have entered %s, which corresponds to March. Thank you!", monthInt);
        }

        else if (monthInt == 4){
            System.out.format("You have entered %s, which corresponds to April. Thank you!", monthInt);
        }

        else if (monthInt == 5){
            System.out.format("You have entered %s, which corresponds to May. Thank you!", monthInt);
        }

        else if (monthInt == 6){
            System.out.format("You have entered %s, which corresponds to June. Thank you!", monthInt);
        }

        else if (monthInt == 7){
            System.out.format("You have entered %s, which corresponds to July. Thank you!", monthInt);
        }

        else if (monthInt == 8){
            System.out.format("You have entered %s, which corresponds to August. Thank you!", monthInt);
        }

        else if (monthInt == 9){
            System.out.format("You have entered %s, which corresponds to September. Thank you!", monthInt);
        }

        else if (monthInt == 10){
            System.out.format("You have entered %s, which corresponds to October. Thank you!", monthInt);
        }

        else if (monthInt == 11){
            System.out.format("You have entered %s, which corresponds to November. Thank you!", monthInt);
        }

        else if (monthInt == 12){
            System.out.format("You have entered %s, which corresponds to December. Thank you!", monthInt);
        }

        //If user entered integer not between 1 and 12 (invalid input), terminate program.
        else{
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }


    }
}
