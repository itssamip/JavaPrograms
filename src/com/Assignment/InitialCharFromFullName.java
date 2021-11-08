package com.Assignment;

public class InitialCharFromFullName {
    public static void main(String[] args) {
        String name = "Sandy Kumar Lama";

        System.out.println(Character.toUpperCase(name.charAt(0)));
        for(int i=1; i< name.length() -1 ; i++){
            if(name.charAt(i) == ' '){
                System.out.println(" " + Character.toUpperCase(name.charAt(i + 1)));
            }
        }


    }
}
