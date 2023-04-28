package com.assignment.task4;

public class Problem5 {
    public static void main(String args[]) {
        int arr1[][] = new int[][]{{1,2,3}, {3,4,5}, {6,7,8}};

        int arr2[][] = new int[][]{{3,4,5},{4,5,6},{7,8,9}};
        int add[][] = new int[arr1.length][arr1[0].length];
        System.out.println("Matrix arr1 is" );
        printMatrix(arr1);

        System.out.println("Matrix arr2 is" );
        printMatrix(arr2);

        for(int i=0;i<arr1.length;i++) {

            for(int j=0;j<arr1[0].length;j++) {

                add[i][j] = arr1[i][j] + arr2[i][j];

            }

        }

        System.out.println("The sum of the two matrices arr1 and arr2 is ...." );
        printMatrix(add);


    }

    private static void printMatrix(int m[][]) {

        for(int i=0;i<m.length;i++) {
            for(int j=0;j<m[0].length;j++)
                System.out.print(m[i][j]+ " ");
            System.out.println();
        }
    }
}
