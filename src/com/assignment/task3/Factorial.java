package com.assignment.task3;

import java.util.Scanner;

public class Factorial {

// Problem 2
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for which you need a factorial to be found.... ");
        int n = scanner.nextInt();

        long fact = 1;

        for(int i=1;i<=n;i++) {
            fact = fact * i;

        }
        System.out.println("The factorial of the number n is " + fact);


    }

}
