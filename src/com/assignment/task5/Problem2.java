package com.assignment.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with spaces in it to be reveresed...");
        String str = scanner.nextLine();
        System.out.println(str);

        String strArr[] = str.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i=0;i<strArr.length;i++) {
            char reverseArr[] = reverseString(strArr[i]);
            String reverseString = new String(reverseArr);
            result.append(reverseString);
            if(i!=strArr.length-1)
                result.append(" ");
        }
        System.out.println("The reversed String is " + result);


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
