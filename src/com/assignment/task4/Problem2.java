package com.assignment.task4;

import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array..");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " + size + " number of elements");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];

        }
        float avg  = sum/size;
        System.out.println("The average of the arrays is " + avg);


    }
}
