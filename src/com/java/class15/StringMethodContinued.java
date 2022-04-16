package com.java.class15;

public class StringMethodContinued {

    public static void main(String[] args) {

        System.out.println("=============Split================");
        //12. split --> splits a sentence and puts one word into an index in an array
        // - is case sensitive
        //need to declare an array and puts each word into an index

        String hi = "Hello this is my practice problem. Let's do more Practice.";
        String[] hi2 = hi.split("t");

        for(int i = 0; i<hi2.length;i++){
            System.out.println(hi2[i]);
        }
        //Hello
        //his is my prac
        //ice problem. Le
        //'s do more Prac
        //ice.

        String str1 = "Welcome to java class";
        String[] words = str1.split(" ");
        System.out.println(words[0]); //Welcome
        System.out.println(words[1]); //to
        System.out.println(words[2]); //java
        System.out.println(words[3]); //class

        for(int i =0; i<=3; i++){
            System.out.println(words[i]);
        }
        //or for (int i = 0; i<words.length;i++){
        //words.length --> gives us total amount of words
        // word.length in this case = 4. So we do i<words.length not <=
        //use words.length to hardcode the data

        String str2 = "My name is Yasmine morman";
        String[] name = str2.split("m");
        //does not print out the letter you put in ""
        System.out.println(name[0]); //My nam
        System.out.println(name[1]); //e is Yas
        System.out.println(name[2]); //ine
        System.out.println(name[3]); //or
        System.out.println(name[4]); //an

        System.out.println("================SubString==================");
        //subString -->
        str1 = "Welcome to java class. Today is a fun day";
        System.out.println(str1.substring(7)); // does index - 1
        System.out.println(str1.substring(0,5)); //doesn't print the character in the 5 index


        System.out.println("===============Replace================");
        str1="INR 200 INR 300 INR 500";
        System.out.println(str1.replace("INR", "USD"));


        System.out.println("===============ReplaceAll================");
        System.out.println(str1.replaceAll("[0-9]", ""));


    }
}
