package com.assignment.task7;

public class Problem8 {

    public static void main(String args[]) {
        int arr[] = {212, 3, 4, 6,10,12 ,2000};

        int max = arr[0];

        for(int ele : arr) {
            max  = ele > max ? ele : max;
        }
        System.out.println("The maximum element in the array is " + max);
    }
}
