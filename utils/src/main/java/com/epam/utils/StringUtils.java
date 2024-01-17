package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        double number;
        try {
            number = Double.parseDouble(str);
        } catch (NumberFormatException | NullPointerException exception) {
            return false;
        }
         return number > 0;
    }
}
