package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbReadingString = new Scanner(System.in);
        System.out.println("Yo, type in a word bro");
        String sign = kbReadingString.next();
        System.out.println("Yo, type in another word bro");
        String word1 = kbReadingString.nextLine();
        String word2 = kbReadingString.nextLine();
        if (sign.length() == word2.length()) {
           char [] array1 = word1.toCharArray();
            char [] array2 = word2.toCharArray();
            int word111 = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i])
                    word111++;
            }
            if (word111 == array2.length);
            System.out.println("Your words ARE anagrams of each other! Good job bro.");
        }
        else {
            System.out.println("Your words AREN'T anagrams of each other. Sorry bro.");
            System.exit(0);
        }
    }
}




