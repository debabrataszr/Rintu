package com.bridgelabz.practice.feb18_2023_practice;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int[] arr={25,14,56,15,36,56,77,18,29,49};
        System.out.println("Original Array:" + Arrays.toString(arr));

        //Remove the second element
        int removeIndex=1;
        for(int i=removeIndex;i< arr.length-1;i++) {
            arr[i]=arr[i+1];
        }
        System.out.println("After removing the second element:" +Arrays.toString(arr));
    }
}
