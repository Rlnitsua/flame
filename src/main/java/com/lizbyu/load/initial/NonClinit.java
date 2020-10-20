package com.lizbyu.load.initial;

import java.util.logging.Logger;

public class NonClinit {
    @SuppressWarnings("unused")
    // won't generate clinit method
    private int num = 1;

    public static void main(String[] args) {
        Logger.getGlobal().info("hello world");
    }
}
