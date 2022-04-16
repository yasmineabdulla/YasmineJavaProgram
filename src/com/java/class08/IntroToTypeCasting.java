package com.java.class08;

public class IntroToTypeCasting {

    public static void main(String[] args) {

        //Type Conversion
        //Widening type casting
        //Implicit type casting - java will do this without error

        int a = 10;
        double d = a;
        System.out.println(d);
        //10.0

        /*
        double dd = 10.9;
        int aa = dd;
        System.out.println(aa);
        //error bc cant put big data into small data
         */

        //type casting - double to int
        //narrowing type casting
        //explicit type casting, user has to put target data type in peranthesis

        double dd = 10.0;
        int aa = (int)dd;
        System.out.println(aa);
        //10

        // can't do String to int
        // or int to String
    }
}
