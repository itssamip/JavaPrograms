package com.Assignment;

public class PartOfGivenSentence {
    public static void main(String[] args) {
        String name = "Welcome to OneClick Consulting";

        if(name.contains("to") || name.contains("hi")){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
