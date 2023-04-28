package com.assignment.task3;

public class Problem10 {
    public static void main(String args[]) {

        int total = 11;
        int arr[] = {1, 3, 5, 6};

        for(int i=0;i < 4; i++) {

            int numberOfElements = arr[i];
             for(int j=1; j<=total; j++) {
                if(j<=numberOfElements || j > total - numberOfElements)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();


        }



    }
}
