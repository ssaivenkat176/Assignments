package com.assignment.task2;

import java.util.Scanner;

// Note the question is worded wrong as the amount between 270 and 300 is excluded and could lead to wrong calculations
public class Problem9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter units of electricity to calculate bill...");

        int units = scanner.nextInt();
        double sumBill;
        if( units<= 60)
            sumBill = units * 0.3;

        else if(units<=150)
            sumBill = 18 + (units-60) * 0.75;
        else if(units <= 270)
            sumBill = 85.5 + (units - 150) * 1.10;
        else {
            sumBill = 217.5 + (units - 270) * 2.5;
        }
      System.out.println("Total bill is " + (sumBill + (sumBill * 0.2)));



    }
}
