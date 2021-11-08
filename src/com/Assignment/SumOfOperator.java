package com.Assignment;

import java.util.Scanner;

public class SumOfOperator {
    public static void main(String[] args) {
        int a, b, c, sum;
        Scanner readme = new Scanner(System.in);

        System.out.println("Enter first number ");
        a = readme.nextInt();

        System.out.println("Enter Second Number ");
        b= readme.nextInt();

        System.out.println("Enter third Number ");
        c= readme.nextInt();

        sum = a + b + c;
        System.out.println("The sum of number is " + sum);

    }
}
