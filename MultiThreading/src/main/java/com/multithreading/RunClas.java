package com.multithreading;

public class RunClas implements Runnable {
    @Override
    public void run() {
        while (true)
            System.out.println(Thread.currentThread().getName());
    }
}
