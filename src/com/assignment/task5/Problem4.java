package com.assignment.task5;

import java.util.Scanner;

public class Problem4 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String...");
        String str = scan.next();

        System.out.println("Enter a character...");

        char ch = scan.next().charAt(0);
        int count = 0;

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==ch)
                count++;

        }


        System.out.println("The number of times charcater " + ch + " occurs in " + str+ " is "+ count);


    }
}
