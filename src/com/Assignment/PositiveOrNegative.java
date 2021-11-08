package com.Assignment;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int number;
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is positive or negative");
        number = readme.nextInt();

        if (number > 0){
            System.out.println("It is positive number");
        }
        else{
            System.out.println("It is negative number");
        }
    }
}
