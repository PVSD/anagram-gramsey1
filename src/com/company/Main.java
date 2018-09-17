package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner kbReadingString = new Scanner(System.in);
        Scanner kbReadingInt = new Scanner(System.in);
        System.out.println("Yo, type in a word bro");
        String sign = kbReadingString.next();
        System.out.println("Yo, type in another word bro");
        String word1 = kbReadingString.nextLine();
        String word2 = kbReadingString.nextLine();


        if (word1.length() != word2.length()) {
            System.out.println("no");
        }

    }
}




