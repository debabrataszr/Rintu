package com.bridgelabz.practice;

public class ArraySumEight {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sum(arr1);
    }


 static void sum(int[] a) {
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {

                if(a[i]+a[j] > 8) {
                    System.out.println("Pairs are :"+ a[i] + " & " + a[j]);
                }
            }
        }
    }
}