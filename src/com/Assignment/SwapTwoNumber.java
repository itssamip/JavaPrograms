package com.Assignment;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 2, b = 3;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(" swapped successfully  a = " + a + ", b = " + b) ;
    }
}
