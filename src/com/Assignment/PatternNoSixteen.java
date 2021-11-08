package com.Assignment;

import java.util.Scanner;

public class PatternNoSixteen {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i,j,num;
        System.out.print("Enter how many # you want to print ");
        num = read.nextInt();

        for ( i = 0; i < num; i++) {
            for ( j = 0; j <=i ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (i =num-1; i>0; i--){
            for (j = 0; j<=i-1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
