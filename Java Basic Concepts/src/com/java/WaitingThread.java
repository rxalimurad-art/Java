package com.java;

public class WaitingThread extends Thread {
    private final Object lock;

    public WaitingThread(Object lock, String name) {
        super(name);
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            try {
                System.out.println(getName() + " is waiting...");
                lock.wait();
                System.out.println(getName() + " resumed!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}