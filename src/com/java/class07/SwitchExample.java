//using switch, have user input month and tell them how many days are in it

package com.java.class07;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a month:");

        String month = sc.nextLine();

        switch (month){

            case "January":
                System.out.println("31 days in this month.");
                break;
            case "February":
                System.out.println("28 days in this month.");
                break;
            case "March":
                System.out.println("31 days in this month.");
                break;
            case "April":
                System.out.println("30 days in this month.");
                break;

                // or you can combine cases!!!!!!

            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days in this month.");
                break;
            case "June":
            case "September":
            case "November":
                System.out.println("30 days in this month.");
                break;

            default:
                System.out.println("Enter a proper month or you made a spelling mistake");
                break;
        }


    }
}
