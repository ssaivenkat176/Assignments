package com.assignment.task4;

import java.util.Scanner;

public class Problem8 {
    public static void main(String args[]) {

        System.out.println("Enter the size of elements");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        System.out.println("Enter " + size + "number of distinct elements");

        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = scanner.nextInt();
        }
        if(size<3)
            System.out.println("The number of elements are too less to find third largest element");
        else {
            findLargestAndSwap(size, arr);
            findLargestAndSwap(size - 1, arr);
            findLargestAndSwap(size - 2, arr);
            System.out.println("The third largest value is " + arr[size-3]);
        }

    }
    private static void findLargestAndSwap(int size,int arr[]) {
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size; i++) {
            if(arr[i]>max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        // Swap the largest element at the end of the array
        int temp = arr[maxIndex];
        arr[maxIndex]  = arr[size-1];
        arr[size-1] = temp;

    }
}
