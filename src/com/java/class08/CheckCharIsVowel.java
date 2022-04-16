//check if character is vowel. use if statements

package com.java.class08;


public class CheckCharIsVowel {

    public static void main(String[] args) {

        String vowel = "a";

        // for string: variable.equals("");
        // for char: variable == 'a';

        if ( vowel.equals("a") || vowel.equals("e") || vowel.equals("i") ||  vowel.equals("o") || vowel.equals("a")) {
            System.out.println("vowel");
        }else {
            System.out.println("constanent");
        }



    }

}


