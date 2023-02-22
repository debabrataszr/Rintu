package com.bridgelabz.practice.feb19_2023_practice;

import java.util.Arrays;

//Write a Java program to insert an element (specific position) into an array.
public class Practice8 {
    public static void main(String[] args) {

        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int Index_position = 2;
        int newValue = 5;

        System.out.println("Original array:" + Arrays.toString(arr));

        for (int i = arr.length - 1; i > Index_position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[Index_position] = newValue;
        System.out.println("New array:" + Arrays.toString(arr));

    }
}