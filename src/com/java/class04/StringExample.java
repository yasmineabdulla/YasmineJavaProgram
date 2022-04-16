package com.java.class04;

public class StringExample {

    public static void main(String args[])

    {
        int a = 10; int b = 20;
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(a);
        System.out.println(str1);
        System.out.println(str1+str2);
        System.out.println(str1+ " " +str2); // HelloJava
        // + " " + to put a space
        System.out.println(str1 + a);
        System.out.println(str1 + a + b); // Hello1020
        //Hello1020 bc it will go left to right. And there is only +, so neither has more priority
        System.out.println(a + b + str1); // 30Hello
        System.out.println("a + b"); //a+b
        System.out.println("a"+b); //a20
        System.out.println(str1 + a * b); //Hello200
            //bc you do the multiplication first and then the addition
        //System.out.println(str1 + a - b);  //Error, bc you cant do String - integer  (Hello10 - 30)
        System.out.println(a - b + str1); //-10Hello

        /*Integer (I) String (S)
        S+I = SI (concatenation)
        I+S = IS (concatenation)
        I + I = I (addition)
        S + S = SS
         */



    }

}
