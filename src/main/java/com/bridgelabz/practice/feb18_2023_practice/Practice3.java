package com.bridgelabz.practice.feb18_2023_practice;

public class Practice3 {
    public static void main(String[] args) {
        int[] arr = {20,30,25,35,-16,60,-100};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

            double average = sum / arr.length;
            System.out.println("Average value of the array is:" + average);
        }
    }

