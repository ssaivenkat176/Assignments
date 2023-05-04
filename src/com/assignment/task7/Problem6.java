package com.assignment.task7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Problem6 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a  string to find number of occurences of charcater.... ");

        String str = sc.next();

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0) + 1);

        }

        Iterator<Character> it = map.keySet().iterator();

        while(it.hasNext()) {
            Character ch = it.next();
            System.out.println("The count of charcater " + ch + " is " + map.get(ch));

        }

    }
}
