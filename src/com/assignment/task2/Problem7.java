package com.assignment.task2;

import java.util.Scanner;

public class Problem7 {

    public static void main(String args[]) {
        int a;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number..");
            a = sc.nextInt();
            if( a>0 )
                System.out.println("Good Going");
            else
                break;

        } while(true);

        System.out.println("It's Over");

    }
}
