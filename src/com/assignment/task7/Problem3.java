package com.assignment.task7;


public class Problem3 {
    public static boolean hasUniqueChars(String str) {

        boolean[] seenChars = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int charValue = str.charAt(i);

            if (seenChars[charValue]) {
                return false;
            }

            seenChars[charValue] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcdeA";
        String str2 = "Hello";

        System.out.println(str1 + " has all unique characters: " + hasUniqueChars(str1));
        System.out.println(str2 + " has all unique characters: " + hasUniqueChars(str2));
    }
    }



