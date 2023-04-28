package com.assignment.task2;

import java.util.Scanner;

// Problem 6
public class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers..");

        int a = sc.nextInt();
        int b  = sc.nextInt();
        System.out.println("Enter the operation +,-,*,/, %");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("The sum of two numbers is " + (a+b));
                break;
            case "-":
                System.out.println("The difference b/w two numbers is " + (a-b));
                break;
            case "*":
                System.out.println("The Product of two numbers is " + (a*b));
                break;
            case "/":
                System.out.println("The quotient of two numbers is " + (a/b));
                break;
            case "%":
                System.out.println("The reminder when two numbers are divided " + (a%b));
                break;
            default:
                System.out.println("Invalid operation");
                break;

        }






    }
}
