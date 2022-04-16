package com.java.class15;

public class FindEachComponentOfAddress {

    public static void main(String[] args) {

        String address = "B604, Cosmos Society, Magarpatta City, Pune, 1133 ";
        String[] words = address.split(",");
        System.out.println(words[0].trim());
        System.out.println(words[1].trim());
        System.out.println(words[2].trim());
        System.out.println(words[3].trim());
        System.out.println(words[4].trim());

        //.trim() --> removes space in the beginning
    }


}
