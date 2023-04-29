package com.assignment.task5;

import java.util.Scanner;

public class Problem6 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string ...");
        String str = scanner.next();

        System.out.println("Enter a sub string ...");

        String substring = scanner.next();

        if(str.contains(substring))
            System.out.println("The string " + str + " contains the substring " + substring);
        else
            System.out.println("The string " + str + " does not contains the substring " + substring);


    }
}
