package com.assignment.task7;

import java.util.Scanner;

public class Problem1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String ..... ");
        String str = sc.next();

        int count[] = new int[256];

        for(int i=0;i<str.length();i++) {

            int ch = str.charAt(i);

            count[ch] ++;


        }
        int i;

        for(i=0;i<str.length();i++) {
            int ch = str.charAt(i);

            if(count[ch] == 1) {

                System.out.println("The first non-repeating character is " + str.charAt(i));
                break;

            }


        }
        if(i==str.length())
            System.out.println("No non-repeating character");



    }
}
