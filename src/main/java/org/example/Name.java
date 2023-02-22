package org.example;

import static java.lang.System.*;

 public class Name {
    public static void main(String[] args) {
        int max=0;
        int min=100;
        int[] arr= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
              if (arr[i]>max) {
                  max=arr[i];
              }
              if(arr[i]<min) {
                  min = arr[i];
              }
                  System.out.println(arr[i]);
        }
         System.out.println("Highest value= "+max);
         System.out.println("Lowest value= "+min);

    }
 }




