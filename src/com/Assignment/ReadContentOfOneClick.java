package com.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentOfOneClick {
    public static void main(String[] args) {
        try{
            File myFile  = new File("C:\\Users\\Samip\\Desktop\\oneclick.txt");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()){
                String text = reader.nextLine();
                System.out.println(text);
            }
            reader.close();

        }catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
