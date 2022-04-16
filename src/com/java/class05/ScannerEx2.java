// challenge: create a code to multiply 2 numbers, given by user
package com.java.class05;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input 2 numbers to multiply together:");

        int num1= sc.nextInt(), num2 = sc.nextInt();

        System.out.println(num1 * num2);

    }
}
