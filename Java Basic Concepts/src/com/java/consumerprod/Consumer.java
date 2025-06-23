package com.java.consumerprod;

public class Consumer extends Thread {
    private final MessageBox box;

    public Consumer(MessageBox box) {
        this.box = box;
    }

    public void run() {
        try {
            Thread.sleep(1000); // wait so producer tries first and gets blocked
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        box.getMessage();
    }
}