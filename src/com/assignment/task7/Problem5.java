package com.assignment.task7;

import java.util.Scanner;

public class Problem5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if the number is armstrong or not ");
        int num = sc.nextInt();
        if(isArmstrong(num))
            System.out.println("The number " + num + " is an Armstrong number");
        else
            System.out.println("The number " + num + " is not a Armstrong number");

    }
    private static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;

        while(num!=0) {
            sum = sum + (int)Math.pow(num % 10, 3);
            num = num/10;
        }
        if(sum == temp)
            return true;
        return false;

    }

}
