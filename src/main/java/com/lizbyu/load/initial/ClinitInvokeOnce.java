package com.lizbyu.load.initial;

import java.util.logging.Logger;

public class ClinitInvokeOnce {
    private static class DeadLoop {
        // clinit invoke only once
        static {
            Logger.getGlobal().info("clinit invoke...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Runnable r = () -> {
            Logger.getGlobal().info(Thread.currentThread().getName() + " begin...");
            new DeadLoop();
            Logger.getGlobal().info(Thread.currentThread().getName() + " end...");
        };

        for (int i = 0; i < 3; i++) {
            new Thread(r, "thread-" + i).start();
        }
    }
}
