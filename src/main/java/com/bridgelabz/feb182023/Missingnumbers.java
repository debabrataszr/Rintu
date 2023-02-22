package com.bridgelabz.feb182023;

public class Missingnumbers {
    public static void main(String[] args) {

        int[] a = {2, 4, 6, 8, 9, 10, 12, 14};
        Missingnumbers mn = new Missingnumbers();
        mn.Function(1,100, a);
    }

    public void Function(int start, int end, int[] arr) {
        int [] result = new int[end + 1];
        for(int i : arr) {
            result[i]=1;
        }
    for(int i=start;i<result.length;i++)
        if(result[i] == 0){
            System.out.println(i);
        }
    }
}
