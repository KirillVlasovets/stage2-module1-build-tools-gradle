package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (var srt : args) {
            double number;
            if (srt.contains("0")) {
                return false;
            }
            try {
                number = Double.parseDouble(srt);
            } catch (NumberFormatException | NullPointerException exception) {
                return false;
            }
            if (number <= 0) {
                return false;
            }
        }
        return true;
    }
}