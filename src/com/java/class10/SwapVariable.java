package com.java.class10;

import java.util.Scanner;

public class SwapVariable {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        //with a third variable
//        int c = a;
//
//        a= b;
//        b = c;

        //with out using third variable

        a = a + b;
        b= a-b;
        a= a;
        System.out.println(a);
        System.out.println(b);
    }
}
