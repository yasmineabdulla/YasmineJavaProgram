package com.java.class13;

import java.util.Scanner;

public class StringAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = "home";
        String str2 = "home";
        String str3 =sc.next();

        if (str1==str2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(str3==str2){
            System.out.println("True");
        }else{
            System.out.println("false");
        }

        if(str1.equals(str3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }




}
