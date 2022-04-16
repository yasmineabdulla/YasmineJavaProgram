//challenge: write a code to get user input on their age and see if they are eligible to donate
// blood. (must be 18+ and 50kg+ )

package com.java.class06;
import java.util.Scanner;
public class NestedIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter weight");
        int weight = sc.nextInt();

        if (age >= 18){
            if(weight >= 50){
                System.out.println("Eligible: Old enough and Weight enough");
            }else{
                System.out.println("Not Eligible: Old enough, but underweight.");
            }

        }else{
            if (weight>=50){
                    System.out.println("Too Young");
                }else{
                    System.out.println("Totally not eligible");
                }
            }
        }

    }

