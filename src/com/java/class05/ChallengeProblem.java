//challenge: create a code that takes 2 integers from the user and prints out the greater one
//part 2 challenge: specifity whether it num1 is greater, num2 is greater, or equal

package com.java.class05;
import java.util.Scanner;
public class ChallengeProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input 2 numbers: ");

        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("They are equal");
        } else {
            if (num1 > num2) {
                System.out.println(num1 + " is bigger.");
            } else {
                System.out.println(num2 + " is bigger.");
            }
        }

        }
    }
