package com.assignment.task2;

import java.util.Scanner;

// problem 2
public class CharacterCheck {
    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single length character ...");
        char ch = scanner.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("The character " + ch  +" is a character");
        else
            System.out.println("The character " + ch  +" is not a character");


    }
}
