//have user input 3 numbers and output the largest one

package com.java.class08;
import java.util.Scanner;
public class MaximumOutOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

         if( a > b && a > c) {
             System.out.println("The following number is the greatest: " + a);
             //dont have to put a in the next one bc we already checked that in the if above,
             //and if its going to the else, we know a isnt the greatest
         }else if (b > c) {
             System.out.println("The following number is the greatest: " + b);
         } else {
             System.out.println("The following number is the greatest: " + c);
         }

    }


    }

