package com.java.class12;

public class Demo {

    public static void main(String[] args) {

        int i = 1;

        while (i<=50){
            if(i%3!=0){
                System.out.println(i);
            }else if (i%7==0){
                System.out.println(i);
            }else{
                System.out.println(i);
                i++;
            }
        }
    }
}
