//challenge: write a code to determine whether a number is positive negative or zero

package com.java.class06;
import java.util.Scanner;
public class PosNegOrZero {

    public static void main(String[] args) {

        System.out.println("input a number:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 0){
            System.out.println("Number is zero");
        }else if (a>0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
    }
}
