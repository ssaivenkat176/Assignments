package com.assignment.task5;

import java.util.Scanner;

public class Problem1 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be reveresed...");
        String str = scanner.next();
        char reverseArr[] = reverseString(str);
        String reverseString = new String(reverseArr);
        System.out.println("The reversed String is " + reverseString);

    }

    private static char[] reverseString(String str) {
        char ch[] = str.toCharArray();

        int l = ch.length;
        for(int i=0;i<l/2;i++) {
            char temp = ch[l-i-1];
            ch[l-i-1] = ch[i];
            ch[i] = temp;
        }
        return ch;
    }
}
