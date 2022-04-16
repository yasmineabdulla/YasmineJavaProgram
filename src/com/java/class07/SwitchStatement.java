package com.java.class07;
import java.util.Scanner;
public class SwitchStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("THree");
            default:
                System.out.println("Please enter 0-9");
        }

    }
}
