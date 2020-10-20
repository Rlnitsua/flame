package com.lizbyu.load.initial;

import com.lizbyu.util.Logger;

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
        Logger.info(num0);
        Logger.info(num1);
    }
}
