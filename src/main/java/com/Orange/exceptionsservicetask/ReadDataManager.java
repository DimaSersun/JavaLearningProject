package com.Orange.exceptionsservicetask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataManager {
    public static String readDataFromFileWithoutExceptionHandling(String path) throws IOException {

        FileReader fileReader = new FileReader(path);

        BufferedReader reader = new BufferedReader(fileReader);

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        return reader.toString();
    }
    public static String readDataFormFileWithExceptionHandling(String path){
        try{
            FileReader fileReader = new FileReader(path);

            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            return reader.toString();
        }
        catch (Exception e){
            System.out.println("The next exception has been captured: " + e.getMessage());
            return "";
        }
    }
}
