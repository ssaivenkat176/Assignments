package com.assignment.task1;
import java.util.Scanner;

public class Task1 {

    public static void main(String args[]) {


        // Problem 1
        String myName = "Venkat";
        System.out.println("My name is " + myName);

        // Problem 2
        String userName;

        System.out.println("Please enter your name ...");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();

        System.out.println("The name entered in the console is " + userName);

        // Problem 3

        // Swap numbers with temp variable
        int a = 5, b = 10;
        System.out.println("The value of a and b before swapping respectively are " + a + " and  " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a and b after swapping respectively are " + a + " and " + b);

        // Swap numbers without temp variable

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The value of a and b after swapping again respectively are " + a + " and " + b);
    }



}
