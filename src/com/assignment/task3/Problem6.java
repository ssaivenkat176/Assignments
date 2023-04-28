package com.assignment.task3;

import java.util.Scanner;

public class Problem6 {

    public static void main(String args[]) {
        String value = "Yes";


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers for which you want sum");
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println("The sum of two numbers you entered is " + (m+n));


            System.out.println("Enter Yes to perform the same action to find sum of two numbers of your choice..");
            value = scanner.next();


        } while("Yes".equalsIgnoreCase(value));


    }
}
