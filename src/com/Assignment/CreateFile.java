package com.Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        try{
            File myFile  = new File("C:\\Users\\Samip\\Desktop\\oneclick.txt");
            if(myFile.createNewFile()){
                System.out.println("File created : " + myFile.getName());
            }
            else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write("Welcome to oneclick consulting");
            myWriter.close();
            System.out.println("Successfully wrote");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
