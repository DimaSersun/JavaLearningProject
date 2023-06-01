package com.Orange.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {

        String text = null;
        int length;

        length = TextManager.getTextLengthWithExceptionsHandling(text);
        System.out.println("Answer = " + length);
        length = TextManager.getTextLengthWithoutExceptions(text);
        System.out.println("Answer = " + length);
        String word = "Hello";
        length = TextManager.getTextLengthWithExceptionsHandling(text);
        System.out.println("Answer = " + word);
        length = TextManager.getTextLengthWithoutExceptions(text);
        System.out.println("Answer = " + word);
        System.out.println("___");
        System.out.println("5 / 0 = " + ArithmeticOperationService.divideWithExceptionHandling(5, 0));
        System.out.println("10 / 3 = " + ArithmeticOperationService.divideWithExceptionHandling(10, 3));
        System.out.println("___");
        String path = "src/main/java/org/com/Orange/exceptionsservicetask/test.txt";

        try{
            ReadDataManager.readDataFromFileWithoutExceptionHandling(path);
        }
        catch (Exception e){
            System.out.println("The next exception has been captured: " + e.getMessage());
        }
        finally {
            System.out.println("Hi.");
        }

        System.out.println("___");

        path = "src/main/java/org/testorg/exceptionsservicetask/text1.txt";

        ReadDataManager.readDataFormFileWithExceptionHandling(path);

    }
}
