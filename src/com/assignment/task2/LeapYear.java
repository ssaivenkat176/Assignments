package com.assignment.task2;

import java.util.Scanner;

// Problem 4
public class LeapYear {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  a year..");

        long year = scanner.nextLong();

        if(year % 4==0) {

            if(year %100 == 0) {

                if(year %400==0)

                    System.out.println("The year " + year+ " is a leap year");
                else
                    System.out.println("The year " + year+ " is a not a leap year");

            } else
                System.out.println("The year " + year+ " is a leap year");


        }
        else {
                System.out.println("The year " + year+ " is a not a leap year");
        }

    }
}
