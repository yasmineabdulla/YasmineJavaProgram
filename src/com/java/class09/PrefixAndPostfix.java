package com.java.class09;

public class PrefixAndPostfix {

    public static void main(String[] args) {

//        int a = 7;
//        a--;  //6
//        a--;  //5
//        a++;  //6


//        //in expression
//        int i = 1;
//        int j = i++;
//        System.out.println(i);  //2
//        System.out.println(j);  //1
//

//        //ex:
//        int a = 1;
//        int b = 4;
//        int c = b++ + a;
//        System.out.println(a); //        1
//        System.out.println(b); //        5
//        System.out.println(c); //        5


        //ex:

//        int d = 1;
//        int e = 4;
//        int f = d++ + e++;
//        System.out.println(d); //2
//        System.out.println(e); //5
//        System.out.println(f); //5

        //i 6
        //j 3
        //m 2
        //k 8

        int x = 4;
        int y = 4;

        int z = x++ + -- y;
        int w = z++ - x++;

        System.out.println(x); //6
        System.out.println(y); //3
        System.out.println(z); //8
        System.out.println(w); //2




    }
}
