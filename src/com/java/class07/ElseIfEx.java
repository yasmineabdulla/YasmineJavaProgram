package com.java.class07;

public class ElseIfEx {

    public static void main(String[] args) {

        int a = 55;

        if (a% 10 >6){
            System.out.println("1");
        }else if (a%10<6){
            System.out.println("2");
        } else if (a%10==5){
            System.out.println("3");
        }else {
            System.out.println("4");
        }

        //Result: 2. Java runs top to bottom, so even if two conditions are true in the else if, it will
        //print the first corrent one.

    }
}
