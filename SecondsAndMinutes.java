package com.taylorh.dev;

public class SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 60) {
            return "Invalid Value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int secondsToMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        remainingMinutes += secondsToMinutes;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        }

        int minutes = seconds / 60;
        int secondsRemainder = seconds % 60;

        return getDurationString(minutes, secondsRemainder);
    }
}

