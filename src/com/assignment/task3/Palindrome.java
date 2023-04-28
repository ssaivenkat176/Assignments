package com.assignment.task3;
// Problem3
public class Palindrome {

    public static void main(String args[]) {

//        String value = "abccbad";

        String value = "abcbaabcba";
        int i = 0;

        for(i=0;i<value.length()/2;i++) {

            if(value.charAt(i)!=value.charAt(value.length()-i-1)) {
                System.out.println("The String value " +value+ " is not a palindrome");
                break;
            }

        }

        if(i == (value.length())/2)
            System.out.println("The String value " +value+ " is  a palindrome");

    }
    }

