package com.assignment.task4;

import java.util.Arrays;

public class Problem7 {
    public static void main(String args[]) {
      int arr[] = new int[] {2,2,3,3,4,4,4,11,11,11,11};
      int j = 0;

// two pointer approach
      for(int i=0;i<arr.length;i++)  {

          if(arr[i]!=arr[j]) {
              int temp = arr[i];
              arr[i] = arr[++j];
              arr[j]  = temp;

          }

      }

      for(int i = j+1;i<arr.length;i++) {
          arr[i] = 0;
      }

      System.out.println(Arrays.toString(arr));



    }
}
