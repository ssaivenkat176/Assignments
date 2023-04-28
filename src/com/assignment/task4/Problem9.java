package com.assignment.task4;

import java.util.*;

public class Problem9 {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter a target to be found..");

        int target = sc.nextInt();
        System.out.println("Enter " + size + "numbers ");

        int arr[] = new int[size];


        Map<Integer,Integer> map = new HashMap<>();
        int i;
        for(i=0;i<size;i++) {
            arr[i] = scanner.nextInt();

            if(map.containsKey(target-arr[i])) {
                System.out.println("The two indices are ..");
                list.add(i);
                list.add(map.get(target-arr[i]));
                System.out.println(list);
                break;
            }

            map.put(arr[i],i);

        }
        if(i==size)
        System.out.println("The sum is not present " + list);


    }
}

