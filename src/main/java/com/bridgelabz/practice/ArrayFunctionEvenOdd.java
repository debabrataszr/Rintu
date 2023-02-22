package com.bridgelabz.practice;

public class ArrayFunctionEvenOdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Even(arr);
        Odd(arr);
    }

    static void Even(int[] a) {
        for (int i =0; i < a.length; i++) {
              if(a[i] % 2 == 0)
            System.out.println("Even numbers are:"+a[i]);
        }
    }

    static void Odd(int[] b) {
        for (int i = 0; i < b.length;i++) {
            if(b[i] % 2 != 0)
            System.out.println("Odd numbers are:"+b[i]);
        }
    }
}
