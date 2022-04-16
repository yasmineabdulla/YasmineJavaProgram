package com.java.class05;

public class IfCondition {

    public static void main (String[] args)

    {
        //syntax for if condition
        // if(condition)
        //{
            // statements to execute if condition is true
        //}

        // if example

        int isFuelLow= 0;
        System.out.println("1. Starting drive");

        if(isFuelLow==1){
            System.out.println("2. Fill the fuel");
        }

        System.out.println("3. Ending drive");

        // if example

        int fuelPercentage = 35;

        System.out.println("1. Starting drive");

        if (fuelPercentage <= 20){
            System.out.println("2. Fill the fuel");
        }
        System.out.println("3. Ending drive");
    }
}
