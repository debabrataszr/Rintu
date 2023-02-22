package com.bridgelabz.feb182023;

public class Problem1 {
    static public int findMissingnumber(int[] arr, int n) {
// 2 4 6 8 9 10 12 14 25

        // Initialize an array with zero
        // of size equals to the maximum
        // element in the array
        int[] b = new int[arr[n - 1] + 1];

        // Make b[i]=1 if i is present
        // in the array
        for (int i = 0; i < n; i++) {

            // If the element is present
            // make b[arr[i]]=1
            b[arr[i]] = 1;
        }

        // Print the indices where b[i]=0
        for (int i = arr[0]; i <= arr[n - 1]; i++) {
            if (b[i] == 0) {
                System.out.print(i + " ");
            }
        }

        return n;
    }

    // Driver Code
    public static void main(String[] args) {

        // Given array arr[]
        int[] arr = {2, 4, 6, 8, 9, 10, 12, 14, 25};

        int n = arr.length;

        // Function call
        System.out.println(findMissingnumber(arr, n));
    }
}





