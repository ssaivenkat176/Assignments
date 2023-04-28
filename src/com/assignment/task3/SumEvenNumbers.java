package com.assignment.task3;

import java.util.Scanner;

// problem 5
public class SumEvenNumbers {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.. ");
        int n = scanner.nextInt();
        int i = 2;
        int sum = 0;
        while(i<=n) {

            sum = sum + i;
            i = i+2;

        }
        System.out.println(sum);
    }
}
