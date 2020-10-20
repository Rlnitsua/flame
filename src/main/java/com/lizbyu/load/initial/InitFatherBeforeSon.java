package com.lizbyu.load.initial;

import com.lizbyu.util.Logger;

public class InitFatherBeforeSon {
    // initial first
    private static class Father {
        protected static int a = 1;

        static {
            a = 10;
        }
    }

    private static class Son extends Father {
        public static int b = a;
    }

    public static void main(String[] args) {
        // load Father then Son
        // Father: clinit -> init(default) -> Son: clinit -> init(default)
        // Father clinit(): a = 0; -> a = 1; -> a = 10;
        // Son clinit(): b = 10;
        Logger.info(Son.b);
    }
}
