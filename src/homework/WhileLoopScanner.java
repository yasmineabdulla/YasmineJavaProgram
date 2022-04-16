//============= Homework =======================
//        1. Write a program to print table of given number. If user enters 3 then print table of 3 like below
//
package homework;
import java.util.Scanner;
public class WhileLoopScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("I will print a table of 10 numbers, what multiple do you want?");
        int num = sc.nextInt();
        int count = 1;
        int a = 1;

        while (count <= 10){
            a=count*num;
            System.out.println(a);
            count++;

        }

    }
}
