package com.Orange.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createTheFileIfItDoesNotExist(File file){
        try{
            return file.createNewFile();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void informIfTheFileExists(File file){
        if(file.exists()){
            System.out.println("File exist");
        }
        else{
            System.out.println("File don't exist");
        }
    }

    public static void printTheFileName(File file){
        System.out.println("Name of the file is: " + file.getName());
    }

    public static void printTheFileAbsolutePath(File file){
        System.out.println("The absolute path to file is: " + file.getAbsolutePath());
    }

    public static void printIfTheFileIsADirectoryOrNot(File file){
        System.out.println(file.isFile() ? "The file is a file" : "The file is a directory");
    }

    public static void deleteTheFileIfExists(File file) {
        if (file.exists()) {
            if (file.delete())
                System.out.println("Delete the file");
        } else {
            System.out.println("The file doesn't exist");
        }
    }
}
