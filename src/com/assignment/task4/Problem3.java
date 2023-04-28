package com.assignment.task4;

import java.util.Scanner;

// Linear Search
public class Problem3 {

    public static void main(String args[]) {



            Scanner sc = new Scanner(System.in);
            System.out.println("Enter target to be searched for ");
            int target = sc.nextInt();
            System.out.println("Enter the size of the array..");
            int size = sc.nextInt();

            int arr[] = new int[size];
            System.out.println("Enter "+size + " number of elements");

            for(int i=0;i<size;i++) {
                arr[i] = sc.nextInt();
            }

            int i;

            for(i=0;i<size;i++) {
                if(arr[i] == target) {
                    System.out.println("The target is present in the array");
                    break;
                }

            }
            if(i == size)
                System.out.println("The target is  not present in the array");







    }
}
