package com.assignment.task7;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8, 1};

        Set<Integer> set = new HashSet<>();

        for(int ele : arr1) {
            set.add(ele);
        }

        System.out.println("The intersection of the two arrays is ...");

        for(int ele : arr2) {
            if(set.contains(ele))
                System.out.print(ele + "  ");
        }


    }
}
