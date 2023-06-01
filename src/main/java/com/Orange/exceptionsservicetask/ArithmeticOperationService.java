package com.Orange.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideWithNoExceptionHandling(int d, int r){
        return d/r;
    }
    public static int divideWithExceptionHandling(int d, int r){
        try{
            return d/r;
        }
        catch (Exception e) {
            System.out.println("The exception has been captured: " + e.getMessage());
            return 0;
        }

    }
}
