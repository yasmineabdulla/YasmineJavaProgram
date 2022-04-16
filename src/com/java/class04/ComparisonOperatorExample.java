package com.java.class04;

public class ComparisonOperatorExample {

    public static void main(String [] args)
    {
        String str = "Hello";
        int a = 10, b =12, c =10, d = 8;
        str = "Java";
        //now hello is overwritten, it only knows Java

        System.out.println(str);
        System.out.println(a<b); //true
        System.out.println(a>b); //false
        System.out.println(a == b); //false
        System.out.println(a>=c); //true
        System.out.println(a!=b); // != means not equal to
        System.out.println(a!=c); //false

        // 6 operations:    ==, !=, <, >, <=, >=
        // = is an assignment ex: a = 10; == is a comparison of two variables, ex: a == b

        //single line comment

        /*
        double
        line
        comment
         */

        /*
        to single line comment out a large section, highlight, ctrl, /
        to uncomment it, do the same thing. highlight, ctrl, /

        for multi line shortcut, ctrl,shift, slash
         */

        // ctrl z to undo

        //java block {.......}
    }
}
