package com.bridgelabz.practice.feb19_2023_practice;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Original Array:"+ Arrays.toString(arr));
        for(int i=0;i< arr.length/2;i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("Reverse Array:"+Arrays.toString(arr));
    }
}

