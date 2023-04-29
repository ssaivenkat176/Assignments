package com.assignment.task5;

import java.util.Scanner;

public class Problem5 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String...");
        String str = scan.next();
        int vowelCount = 0;
        for(char character: str.toCharArray()) {
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                vowelCount++;
        }
        System.out.println("Total vowel count is " + vowelCount);
        System.out.println("Total consonant count is " + (str.length() - vowelCount));


    }
}
