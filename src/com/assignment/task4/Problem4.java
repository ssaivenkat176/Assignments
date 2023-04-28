package com.assignment.task4;

import java.util.Scanner;

// Binary Search
public class Problem4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target to be searched for ");
        int target = sc.nextInt();
        System.out.println("Enter the size of the array..");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter "+size + " number of elements in ascending order");

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int l = 0, r = size -1;
        int mid;
        boolean isPresent = false;

        while(l<=r) {
            mid =  l+(r-l)/2;
            if(arr[mid] == target) {
                System.out.println("The target is present in the array");
                isPresent = true;
                break;
            }
            else if(arr[mid]>target)
                r = mid-1;
            else
                l = mid+1;
        }


         if(!isPresent)
             System.out.println("The target is  not present in the array");







    }
}
