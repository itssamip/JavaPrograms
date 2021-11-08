package com.Assignment;

import java.util.Locale;

public class CompareName {
    public static void main(String[] args) {
        String name1 = "Sandy";
        String name2 = "sandy";

        boolean diff =  name1.equalsIgnoreCase(name2);

        if(diff){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are not equal");
        }

    }
}
