package org.example;

public class Main {
    public static void main(String[] args) {
        int number=12;
        System.out.println(number);
        int[] arr1={1,2,34,3,5,6,7,4,6,7,3,5,7,3,6,5,6,74,5,6};
        for(int i=0;i< arr1.length;i=i+2) {
            System.out.println(arr1[i]);
        }
        String[] Strarray = {"Audi", "BMW", "Tata", "Maruti", "Ferrari"};

        for (int i = 0; i < Strarray.length; i++) {
            String Strarr = Strarray[i];

            for (int j = 0; j < Strarr.length(); j++) {
                System.out.println(Strarr.charAt(j));
            }
        }
    }
}

