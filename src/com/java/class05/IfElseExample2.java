package com.java.class05;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {

        System.out.println("Enter any number:");
        //line to start scanner class, which allows for user interaction
        Scanner sc = new Scanner(System.in);


        //challenge: create a code to test whether a number is even or odd
        // 4 % 2 = 0 (even)
        // 3 % 2 = 1 (odd)

        int num = sc.nextInt();

        if (num % 2 == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
