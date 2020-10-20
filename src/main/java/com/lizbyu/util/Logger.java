package com.lizbyu.util;

public class Logger {
    private static final boolean IS_DEBUG = true;

    private Logger() {}

    public static void info(int message) {
        info(String.valueOf(message));
    }

    public static void info(String message) {
        if (IS_DEBUG) {
            java.util.logging.Logger.getGlobal().info(message);
        }
    }
}
