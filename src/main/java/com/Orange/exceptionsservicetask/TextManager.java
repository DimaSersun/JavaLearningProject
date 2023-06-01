package com.Orange.exceptionsservicetask;

public class TextManager {
    public static int getTextLengthWithNoExceptionsHandling(String line){
        return line.length();
    }
    public static int getTextLengthWithExceptionsHandling(String line){
        try {
            return line.length();
        }
        catch (Exception e){
            System.out.println("Oops, next exception has been captured: " + e.getMessage() + ". Please recheck your data.");
            return 0;
        }
        finally{
            System.out.println("Row length is calculated.");
        }
    }
    public static int getTextLengthWithoutExceptions(String line){
        if(line == null){
            System.out.println("This line is null.");
            return 0;
        }
        else{
            return line.length();
        }
    }
}
