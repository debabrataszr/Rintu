package com.bridgelabz.practice.feb19_2023_practice;
//Write a Java program to copy an array by iterating the array.
import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {
        int[] arr={25,14,56,15,36,56,77,18,29,49};
        int[] new_arr=new int[10];

        System.out.println("Source Array:"+ Arrays.toString(arr));

        for(int i=0;i< arr.length;i++) {
            new_arr[i]=arr[i];
        }
        System.out.println("New Array:"+Arrays.toString(new_arr));
    }
}
