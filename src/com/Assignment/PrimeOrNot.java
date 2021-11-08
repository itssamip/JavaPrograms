package com.Assignment;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number;
        int temp = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a positive number");
        number = read.nextInt();
        read.close();

        for(int i = 2; i<=number/2; i++){

            temp = number% i;

        }
        if(temp == 0){
            System.out.println( number + " Is not a prime number");
        }
        else{
            System.out.println(number + " Is a prime number");
        }

    }
}
