package com.Assignment;

import java.util.Scanner;

public class PatternNoSevenTeen {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter how many * you want in the number ");
        Scanner read = new Scanner(System.in);
        num = read.nextInt();

        for (int i = 0;  i<=num-1 ; i++)
        {
            for( int j=num-1;j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
}
