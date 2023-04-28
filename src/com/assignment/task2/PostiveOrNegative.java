package com.assignment.task2;

import java.util.Scanner;

// Problem 1
public class PostiveOrNegative {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ....");
        int number = scanner.nextInt();

        if(number>0)
            System.out.println("The number " + number + " is positive");
        else if(number<0)
            System.out.println("The number " + number + " is negative");
    }
}
