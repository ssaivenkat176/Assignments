package com.assignment.task3;

import java.util.Scanner;

// problem 1
public class Fibonacci {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for which you need a fibonacci sequence.... ");
        int  n = scanner.nextInt();
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i=2;i<=n;i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println("The fibonacci sequence is ... ");

        for(int ele : fib) {
            System.out.println(ele);
        }


    }
}
