package com.Assignment;

public class CapitalizeLastPartOfName {
    public static void main(String[] args) {
        String name  = "Sandy Kumar Lama";
        String firstName = name.substring(0,11).toLowerCase();
        String lastName = name.substring(11).toUpperCase();

        System.out.println(firstName + lastName);
    }
}
