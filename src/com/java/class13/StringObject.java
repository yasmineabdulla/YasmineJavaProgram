package com.java.class13;

public class StringObject {

    public static void main(String[] args) {

        String str1 = "berry";
        String str2 = "home";

        if (str1 == str2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        String str3 = "string";
        String str4 = new String("string");

        if (str3 == str4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        String str5 = "string";
        String str6 = new String("string");

        if (str5.equals(str6)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }


}
