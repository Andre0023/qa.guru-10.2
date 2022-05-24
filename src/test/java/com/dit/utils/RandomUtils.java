package com.dit.utils;

import java.util.Random;

public class RandomUtils {
    public static String getRandomString(int length){
        String SALTCHARS = "12345678909QWERTYUIOPasdfghjklzxcvbnm";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < length){
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }



        return result.toString();

    }

}
