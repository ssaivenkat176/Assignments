package com.assignment.task7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Problem9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to find its combinatuons ......");
        String str = scan.next();

        List<String> res = new ArrayList<>();
        res.add("");

        StringBuilder sb = new StringBuilder();
        combinate(str, sb, res, 0, str.length()-1);
        System.out.println(res);


    }

    private static void combinate(String str, StringBuilder sb, List<String> res, int left,int right) {
        if(left > right)
            return;

        else {
            for(int i = left;i<=right;i++) {
                sb.append(str.charAt(i));
                System.out.println(sb);
                res.add(sb.toString());
                combinate(str, sb, res, i+1,right);
                sb.deleteCharAt(sb.length()-1);
            }


        }

    }

}
