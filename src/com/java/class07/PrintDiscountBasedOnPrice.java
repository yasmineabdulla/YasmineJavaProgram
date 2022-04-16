//challenge: take number (price) from user and print discount value
// less than 100 = no discount
//less than 500 = 5% discount
//less than 1,000 = 10% discount
// more than or equal to 1,000 = 15% discount

package com.java.class07;
import java.util.Scanner;
public class PrintDiscountBasedOnPrice {

    public static void main(String[] args) {

        System.out.println("Enter price:");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if (price < 100){
            int newPrice = price;
            System.out.println("No discount");
        }else if (price < 500 ) {
            double newPrice = price * .05;
            System.out.println("Your discount is 5%: " + newPrice);
        }else if (price < 1000){
            double newPrice = price * .1;
            System.out.println("Your discount is 10%: " + newPrice);
        }else if (price >= 1000){
            double newPrice = price * .15;
            System.out.println("Your discount is 15%: " + newPrice);
        }else {
            System.out.println("Enter valid number");
        }

    }
}
