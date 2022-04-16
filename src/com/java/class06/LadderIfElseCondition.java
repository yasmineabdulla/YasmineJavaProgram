//challenge: user enters number 0-6, print days of week
//0- Sunday, 1- Monday, ...etc.

package com.java.class06;
import java.util.Scanner;
public class LadderIfElseCondition {

    public static void main(String[] args) {

        System.out.println("Input number 0-6");
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        //this is the ladder if else
        //it's more efficient than doing multiple if statements

        if (dayNum == 0){
            System.out.println("Sun");
        }else if(dayNum==1){
            System.out.println("Mon");
        }else if(dayNum==2){
            System.out.println("Tues");
        }else if(dayNum==3){
            System.out.println("Wed");
        }else if(dayNum==4) {
            System.out.println("Thurs");
        }else if(dayNum==5) {
            System.out.println("Fri");
        }else if(dayNum==4) {
            System.out.println("Thurs");
        }else if(dayNum==5) {
            System.out.println("Fri");
        }else if(dayNum==6) {
            System.out.println("Sat");
        }else {
            System.out.println("Please enter from 0-6 only");
        }

    }


}
