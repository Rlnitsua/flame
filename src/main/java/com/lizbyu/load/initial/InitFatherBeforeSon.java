package com.lizbyu.load.initial;

import java.util.logging.Logger;

public class InitFatherBeforeSon {
    // initial first
    private static class Father {
        protected static int a = 1;

        static {
            a = 10;
            Logger.getGlobal().info("<clinit> invoke...");
        }

        public Father() {
            Logger.getGlobal().info("<init> invoke...");
        }
    }

    private static class Son extends Father {
        public static int b = a;

        static {
            Logger.getGlobal().info("<clinit> invoke...");
        }

        public Son() {
            Logger.getGlobal().info("<init> invoke...");
        }
    }

    public static void main(String[] args) {
        // init Father then Son
        // Father clinit(): a = 1; a = 10;
        // Son clinit(): b = 10;
//        Logger.getGlobal().info("Son.b : " + Son.b);
         new Son();
    }
}
