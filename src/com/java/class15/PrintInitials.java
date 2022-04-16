package com.java.class15;

import java.util.Scanner;

public class PrintInitials {

    public static void main(String[] args) {

        //String fullName = "Yasmine M Abdulla"; //C.B.K

        System.out.println("Enter full name:");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        String[] initials = fullName.split(" ");
        System.out.println(initials[0].substring(0,1) + "." + initials[1].substring(0,1)
                + "." + initials[2].charAt(0));





    }
}
