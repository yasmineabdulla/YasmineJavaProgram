//ctrl Alt L - automatically reformats your code
//challenge: have user input month and tell them how many days is in itb

package com.java.class06;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        System.out.println("Enter a month 1-12 and I'll tell you how many days are in it.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("January has 31 days");
        } else if (a == 2) {
            System.out.println("Feb has 28 days and 29 day on a leap year");
        } else if (a == 3) {
            System.out.println("March has 31 days");
        } else if (a == 4) {
            System.out.println("April has 30 days");
        } else if (a == 5) {
            System.out.println("May has 31 days");
        } else if (a == 6) {
            System.out.println("June has 30 days");
        } else if (a == 7) {
            System.out.println("July has 31 days");
        } else if (a == 8) {
            System.out.println("August has 31 days");
        } else if (a == 9) {
            System.out.println("September has 30 days");
        } else if (a == 10) {
            System.out.println("October has 31 days");
        } else if (a == 11) {
            System.out.println("November has 30 days");
        } else {
            System.out.println("December has 31 days");
        }
    }
}
