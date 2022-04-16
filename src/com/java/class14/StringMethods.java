package com.java.class14;

import java.util.Locale;

public class StringMethods {

    public static void main(String [] args) {

       String str1 = "Hello World";
       String str2 = "hello World";
       String str3 = "Hello World! Welcome to DevX!";

        System.out.println("=======Method1=======");

       //1. We want to check equality of 2 strings
        System.out.println(str1.equals(str2)); //false
        System.out.println("");

        System.out.println("=======Method2=======");

       //2. We want to check equality of 2 strings ignoring case
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println("");

        System.out.println("=======Method3=======");

        //3.  Check one String contains another String
        // Contains will check one string contains another string considering case
        System.out.println(str1.contains(str3)); //false bc str3 doesnt have all of string 1
        //if swapped
        System.out.println(str3.contains(str1)); //true bc
        System.out.println(str3.contains(str2)); //false bc case sensitive

        //Challenge str 3 contains str 2 but not case sensitive
        //do this by making each statement either uper or lower and then do contains
        String str3U = str3.toUpperCase();
        String str2U = str2.toUpperCase();
        System.out.println(str3U.contains(str2U)); //true bc we made the case  the same
        //or do :
        //System.out.println(str3.toUpperCase().contains(str2.toUpperCase()));
        System.out.println("");

        System.out.println("=======Method4=======");

        //4. changing the case of the String
        System.out.println("4. Upper Case: " + str3.toUpperCase());
        System.out.println("4. Lower Case: " + str3.toLowerCase());

        System.out.println("");

        System.out.println("=======Method5=======");

        //5. find index of character
        str1 = "Helldo World";
        System.out.println("5. Index of Character: " + str1.indexOf("d")); // 4

     System.out.println(str1.lastIndexOf("d"));//11

        // H = 0, e = 1, l = 2, l = 3, o = 4, space = 5, W = 6
        System.out.println("");

        System.out.println("=======Method6=======");

        //6. Find character at specific index
        System.out.println("Char at Index 0: " + str1.charAt(0));
        System.out.println("");

        System.out.println("=======Method7=======");

        //7. Length of String
        str1 = "Hello World";
        str3 = "Hello World! Welcome to DevX!";
        System.out.println(str1.length());
        System.out.println(str3.length());
        System.out.println("");

        String str4 = "Time is";
        System.out.println(str4.length());

        System.out.println("=======Method8=======");

        str1 = "         ";
        str3 = "";
        System.out.println("8. Empty: "+ str1.isEmpty()); //false
        System.out.println("8. Empty: "+ str3.isEmpty()); //true
        System.out.println("8. Empty: "+ str1.isBlank()); //tru
        System.out.println("8. Empty: "+ str3.isBlank()); //tru

        System.out.println("=======Method9=======");

        //9. Replace and ReplaceAll
     str1 = "Welcome";
     str2= "Devx";
     System.out.println("" + str1.replace("User","gh"));

     String str6 = "USD 200";
     String str7 = "IRL";

        System.out.println(str6.replace("USD", str7));



     //10. Format
     System.out.println("Welcome %s");
     System.out.println(String.format(str1,"Chirag"));

    }

}
