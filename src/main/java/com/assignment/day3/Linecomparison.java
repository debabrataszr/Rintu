package com.assignment.day3;

import java.util.Scanner;

public class Linecomparison {
    static void calculate(int x, int y) {

        System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
    }

    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter value for x");

            int x = sc.nextInt();
            System.out.println("enter value for y ");
            int y = sc.nextInt();
            calculate(x, y);
            sc.close();
        } catch (Exception e) {
            System.out.println("enter integer only");
        }
    }
}

