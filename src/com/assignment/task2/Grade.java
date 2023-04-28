package com.assignment.task2;

import java.util.Scanner;

// Problem 5
public class Grade {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number which reprsents percentage...");

        int percent = scanner.nextInt();
        if(percent >90)
            System.out.println("The grade is A");
        else if(percent>75)
            System.out.println("The grade is B");
        else if(percent>65)
            System.out.println("The grade is C");

    }

    }
