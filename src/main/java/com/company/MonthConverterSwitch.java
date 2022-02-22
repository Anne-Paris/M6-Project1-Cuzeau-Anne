package com.company;

import java.util.Scanner;

public class MonthConverterSwitch {


//    public static String getMsg(int monthInt) {
//        String msg =;
//        s\
//        return super.toString();
//    }

    public static void main(String[] args) {
        // Call the scanner and initiate variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 12:");
        int monthInt = Integer.parseInt(scanner.nextLine());

        switch(monthInt){
            default: System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
                break;
            case 1:  System.out.format("You have entered %s, which corresponds to January. Thank you!", monthInt);
                break;
            case 2:  System.out.format("You have entered %s, which corresponds to February. Thank you!", monthInt);
                break;
            case 3:  System.out.format("You have entered %s, which corresponds to March. Thank you!", monthInt);
                break;
            case 4: System.out.format("You have entered %s, which corresponds to April. Thank you!", monthInt);
                break;
            case 5:   System.out.format("You have entered %s, which corresponds to May. Thank you!", monthInt);
                break;
            case 6:  System.out.format("You have entered %s, which corresponds to June. Thank you!", monthInt);
                break;
            case 7:  System.out.format("You have entered %s, which corresponds to July. Thank you!", monthInt);
                break;
            case 8:  System.out.format("You have entered %s, which corresponds to August. Thank you!", monthInt);
                break;
            case 9:  System.out.format("You have entered %s, which corresponds to September. Thank you!", monthInt);
                break;
            case 10: System.out.format("You have entered %s, which corresponds to October. Thank you!", monthInt);
                break;
            case 11: System.out.format("You have entered %s, which corresponds to November. Thank you!", monthInt);
                break;
            case 12: System.out.format("You have entered %s, which corresponds to December. Thank you!", monthInt);
                break;

        }
    }

}
