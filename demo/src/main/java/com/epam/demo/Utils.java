package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (var srt : args) {
            double number;
            try {
                number = Double.parseDouble(srt);
            } catch (NumberFormatException exception) {
                return false;
            }
            if (number <= 0) {
                return false;
            }
        }
        return true;
    }
}