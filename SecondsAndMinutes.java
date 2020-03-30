package com.taylorh.dev;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 60) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        long secondsToMinutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        remainingMinutes += secondsToMinutes;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long secondsRemainder = seconds % 60;

        return getDurationString(minutes, secondsRemainder);
    }
}

