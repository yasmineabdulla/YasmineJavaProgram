package com.java.class05;
//line to import Scanner, memorize
import java.util.Scanner;

public class ScannerClassExample {
    // Scanner class - used to get user input in program
    public static void main(String[] args) {

        //memorize this line
        Scanner sc = new Scanner(System.in);
        //sc.nextInt() , memorize- allows user to input
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println(num1 + num2);
    }
}
