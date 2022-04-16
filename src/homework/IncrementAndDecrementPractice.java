package homework;

public class IncrementAndDecrementPractice {

    public static void main (String [] args) {

        //========================== Find Output of Below Program ================

//        int i = 4, j = 4, k = 4;
//        int m = i++ + j-- + --k;
//        System.out.println(i); //5
//        System.out.println(j); //3
//        System.out.println(k); //3
//        System.out.println(m); //11

//        //========================== Find Output of Below Program ================
//
//        int i = 4, j = 4, k = 4;
//        int m = ++i + ++j + --k;
//        System.out.println(i); //5
//        System.out.println(j); //5
//        System.out.println(k); //3
//        System.out.println(m); //13

//        //========================== Find Output of Below Program ================
//        int i = 4, j = 4, k = 4;
//        i = j++ + --k;
//        int m = i + j + k;
//        System.out.println(i); //7
//        System.out.println(j); //5
//        System.out.println'/'(k); //3
//        System.out.println(m); //15

       // ========================== Find Output of Below Program ================
        int i = 4, j = 4, k = 4;
        i=j++;
        j=k++;
        k=--i;
        int m = i + j + k--;
        System.out.println(i); //3
        System.out.println(j); //4
        System.out.println(k); //2
        System.out.println(m); //10
    }
}
