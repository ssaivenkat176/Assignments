package com.assignment.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem11 {


    public  static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array...");
        int n = scanner.nextInt();

        System.out.println("Now enter the of elements... ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Entered array is" + Arrays.toString(arr));

        System.out.println("Enter the target...");

        int target = scanner.nextInt();

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n;i++) {

            List<Integer> l = new ArrayList<>();
            int currSum = arr[i];

            if(currSum == target) {
                l.add(i);
                l.add(i);
                result.add(l);
                continue;

            }

            for(int j= i+1; j<n; j++) {

                if(currSum + arr[j] == target) {
                    l.add(i);
                    l.add(j);
                    result.add(l);
                    currSum = target;
                }
                else if(currSum + arr[j]> target)
                    break;
               else
                    currSum = currSum + arr[j];

            }


        }


        System.out.println(result);
        if(result.size() == 0)
            System.out.println("No sub array exists with this sum.....");


        for(List<Integer> l : result) {
            int i = l.get(0);
            System.out.print("List  ... ");
            for(int k = i; k<=l.get(1);k++) {
                System.out.print(arr[k] + " ");

            }
            System.out.println();


        }

    }
}
