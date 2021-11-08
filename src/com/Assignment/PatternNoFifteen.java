package com.Assignment;

import java.util.Scanner;

public class PatternNoFifteen {
    public static void main(String[] args) {
        int i,j,num;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter how many # you want to print ");
        num = read.nextInt();

        for ( i = 0; i < num; i++) {
            for (j = 0; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();

        }

    }
}
