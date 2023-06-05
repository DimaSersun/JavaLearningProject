package com.Orange.filemanagementservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;

public class InputFileReadManager {
    public static void printDataFromAFile(File file){
        FileReader fileReader = null;

        try{
            fileReader = new FileReader(file);
            int chars;
            while ((chars = fileReader.read()) != -1){
                System.out.println((char) chars);
            }
        }
        catch (Exception e){
            System.out.println("Cannot read the file: " + e.getMessage() );
        }
        finally {
            try {
                if(fileReader != null){
                    fileReader.close();
                }
            }
            catch (Exception e){
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }

    public static void printDataFromAFileUsingBufferReader(File file){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("Cannot read the file: " + e.getMessage() );
        }
        finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(fileReader != null){
                    fileReader.close();
                }
            }
            catch (Exception e){
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }

    public static void printDataFromFileUsingFiles(File file){
        try {
            System.out.println(Files.readString(file.toPath()));
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
