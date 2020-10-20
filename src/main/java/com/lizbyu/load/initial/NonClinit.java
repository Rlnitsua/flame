package com.lizbyu.load.initial;

import com.lizbyu.util.Logger;

public class NonClinit {
    @SuppressWarnings("unused")
    // won't generate clinit method
    private int num = 1;

    public static void main(String[] args) {
        Logger.info("hello world");
    }
}
