package com.lizbyu.load.initial;

import java.util.logging.Logger;

public class InitStaticVariable {
    private static int num0 = 1;

    static {
        num0 = 2;
        // won't change the value
        num1 = 2;
        // num1 = 1 (automatic generation)
    }

    private static int num1 = 1 ;

    public static void main(String[] args) {
        Logger.getGlobal().info("num0 : " + num0);
        Logger.getGlobal().info("num1 : " + num1);
    }
}
