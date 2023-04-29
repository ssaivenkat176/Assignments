package com.assignment.task5;

import java.util.Locale;
import java.util.Scanner;

public class Problem3 {

    public static void main(String args[]) {


        int count[] = new int[26];

        System.out.println("To find if two strings are anagrams or not");

        System.out.println("Enter string 1...");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        System.out.println("Eneter String 2...");
        String str2 = sc.next().toLowerCase();
        boolean areAnagrams = true;

        // If the count of each  character in string 1 is same as string 2
        // then both are anagrams of each other]
        if(str1.length()!=str2.length())
            areAnagrams = false;
        else {
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < str2.length(); i++) {
                count[str2.charAt(i) - 'a']--;
            }

            for(int i=0;i<count.length;i++) {
                 if(count[i]!=0) {
                     areAnagrams = false;
                     break;

                 }

            }
        }

        if(areAnagrams)
            System.out.println("The string " + str1 + " and " + str2 + " are anagrams");
        else
            System.out.println("The string " + str1 + " and " + str2 + " are not anagrams");




    }
}
