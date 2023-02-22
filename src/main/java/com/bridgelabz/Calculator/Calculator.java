package com.bridgelabz.Calculator;

public class Calculator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
    }

    public static void add(int a, int b) {
        int add = a + b;
        System.out.println("Addition:" + add);
    }

    public static void subtract(int a, int b) {
        int subtract = a - b;
        System.out.println("Subtraction:" + subtract);
    }

    public static void multiply(int a, int b) {
        int multiply = a * b;
        System.out.println("Multiplication:" + multiply);
    }

    public static void divide(int a, int b) {
        int divide = a / b;
        System.out.println("Division:" + divide);
    }
}

