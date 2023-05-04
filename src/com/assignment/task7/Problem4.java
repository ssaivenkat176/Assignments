package com.assignment.task7;

import java.util.Scanner;

public class Problem4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence to find number of words in a sentence .... ");
        String sent = sc.nextLine();

        String str[] = sent.split(" ");

        System.out.println("The sentence is " + sent);
        System.out.println("The number of words in the above sentence is " + str.length);

    }
}
