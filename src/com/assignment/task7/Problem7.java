package com.assignment.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem7 {

    private static String swap(String str, int i, int j) {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
    private static void permutate(String str, int left, int right, List<String> result) {

        if(left == right) {
            result.add(str);
            return;
        } else {
            for(int i=left;i<=right;i++) {

                String swap = swap(str, left, i);
                permutate(swap, left+1, right, result);

            }

        }



    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ... ");
        String s = sc.next();

        List<String> res = new ArrayList<>();
        permutate(s,0,s.length()-1,res);
        System.out.println(res);
    }
}
