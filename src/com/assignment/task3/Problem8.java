package com.assignment.task3;

import java.util.Scanner;

public class Problem8 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter as many numbers as you want , press anything other than number at the end to stop...");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(scanner.hasNextInt()) {

            int val = scanner.nextInt();
            if(val < min)
                min = val;
            if(val>max)
                max = val;

        }
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);

    }

}
