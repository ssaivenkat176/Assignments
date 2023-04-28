package com.assignment.task3;

import java.util.Scanner;

// Problem 4
public class PrimeCheck {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime.... ");
        int n = scanner.nextInt();
        boolean isPrime = true;

        if(n<=1)
            isPrime = false;

        for(int i=2;i<=Math.sqrt(n);i++) {

            if( n%i == 0) {
                isPrime = false;
            }
        }
        if(isPrime)
            System.out.println(n + " is a prime number ");
        else
            System.out.println(n + " is not a prime number ");

    }
}
