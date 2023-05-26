package com.Orange.methodstask;

import java.util.Random;

public class DataGeneratorUtil {
    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static int getRandomInt(int max) {
        return (int) (Math.random() * max);
    }

    public static String getRandomMail(int mailLength) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        char tempChar;
        StringBuilder randomMail = new StringBuilder();

        tempChar = alphabet.charAt(getRandomInt(alphabet.length()));
        randomMail.append(tempChar);

        for (int i = 0; i < mailLength -1; i++){
            if(getRandomInt(2) == 0){
                if(getRandomInt(2) == 0){
                    randomMail.append(alphabet.charAt(getRandomInt(alphabet.length())));
                }
                else{
                    tempChar = alphabet.charAt(getRandomInt(alphabet.length()));
                    randomMail.append(Character.toLowerCase(tempChar));
                }
            }
            else{
                randomMail.append(numbers.charAt(getRandomInt(numbers.length())));
            }
        }

        randomMail.append("@gmail.com");

        return randomMail.toString();
    }

    public static String getRandomString(int length){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder randomText = new StringBuilder();

        for(int i = 0 ; i < length ; i++){
            randomText.append(alphabet.charAt(getRandomInt(alphabet.length())));
        }
        return randomText.toString();
    }

    public static boolean getRandomBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public static double getRandomDouble(){
        Random random = new Random();
        return random.nextDouble();
    }

}
