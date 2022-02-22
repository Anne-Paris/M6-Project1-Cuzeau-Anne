package com.company;

import java.util.Scanner;

public class MonthConverterIf {

    public static void main(String[] args) {
        // Call the scanner and initiate variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 12:");
        int monthInt = Integer.parseInt(scanner.nextLine());

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

        else{
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }


    }
}
