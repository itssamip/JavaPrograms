package com.Assignment;


import java.time.LocalDate;
import java.util.Scanner;

public class DateOfBirthCalc {
    public static void main(String[] args) {
        int dob;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your date of birth year");
        dob =read.nextInt();

        int today = LocalDate.now().getYear();

        int age = today - dob;

        System.out.println("you are " + age + " Years old");
    }
}
