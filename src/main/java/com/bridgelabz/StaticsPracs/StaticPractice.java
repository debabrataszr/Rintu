package com.bridgelabz.StaticsPracs;

@SuppressWarnings("InstantiationOfUtilityClass")
public class StaticPractice {
    static int a = 2;

    public static void main(String[] args) {
        StaticPractice staticPractice = new StaticPractice();
        a = 3;
        StaticPractice staticPractice2 = new StaticPractice();
        a = 4;

        System.out.println(staticPractice2.a);
        System.out.println(staticPractice.a);

        MyClass.myFunction();

    }
}


