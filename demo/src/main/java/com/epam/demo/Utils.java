package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (var srt : args) {
            if (Integer.parseInt(srt) < 0) {
                return false;
            }
        }
        return true;
    }
}