package com.assignment.task1;
import java.util.Scanner;

public class Task1 {

    public static void main(String args[]) {

        String myName = "Sai Venkat";
        System.out.println("My name is " + myName);

        String userName;

        System.out.println("Please enter your name ...");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();

        System.out.println("The name entered in the console is " + userName);

        int a = 5, b = 10;
        System.out.println("The value of a and b before swapping respectively are " + a + " and  " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a and b after swapping respectively are " + a + " and " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The value of a and b after swapping again respectively are " + a + " and " + b);
        StringBuffer sb = new StringBuffer("Sai");
        System.out.print(sb.capacity());
        sb.append("Subramani");
        System.out.print(sb);


        StringBuilder sb2 = new StringBuilder("Sai");
        System.out.print(sb2.capacity());

        sb2.append("Subramani2");
        System.out.print(sb2);




    }



}
