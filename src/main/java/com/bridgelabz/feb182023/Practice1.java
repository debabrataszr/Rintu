package com.bridgelabz.feb182023;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] array = {1789, 2023, 1945, 1546, 1456, 1873};

        String[] array1 = {"Java", "Python", "C", "SQL", "C++", "C#"};

        System.out.println("Original numeric array:" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted numeric array:" + Arrays.toString(array));

        System.out.println("Original string array:" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted string array:" + Arrays.toString(array1));
    }
}
