package com.java.class12;

public class forLoop {

    public static void main(String[] args) {

        // for (initialization, condition, increment/decrement)
        //      body

        //print # 1-10

//        for (int i = 1; i<=10; ++i){
//            System.out.println(i);
//        }

        //print 2 4 6  8 10
        for (int i = 1; i<=10; ++i){
            if (i%2==0) {
                System.out.println(i);
            }
        }

        //print 2 4 6  8 10
        for (int i = 1; i<=10/2; ++i){
                System.out.println(i*2);
        }

        //print 2 4 6  8 10
        for (int i = 2; i<=10; i=i+2){
                System.out.println(i);
        }

    }
}
