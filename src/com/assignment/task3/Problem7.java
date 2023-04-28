package com.assignment.task3;

public class Problem7 {

    public static void main(String args[]) {

        for(int i=0;i<5;i++) {
            int space = 5 - i -1;
            for(int j = 1; j<=5; j++) {
                if(j <= space) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
