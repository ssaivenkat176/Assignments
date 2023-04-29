package com.assignment.task5;

import java.util.Locale;
import java.util.Scanner;

public class Problem7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string.....");
        String str = scanner.next().toLowerCase();

        int count[] = new int[26];
        boolean isIsogram = true;

        for(char character : str.toCharArray()) {
            if(count[character - 'a'] > 0)
                isIsogram = false;
            count[character - 'a']++;
        }

        if(isIsogram)
            System.out.println("The string " + str + "has unique elements and is a isogram ");
        else
            System.out.println("The string " + str + "doesn't have unique elements and is not a isogram ");

    }
}
