package com.java.consumerprod;

public class Producer extends Thread {
    private final MessageBox box;

    public Producer(MessageBox box) {
        this.box = box;
    }

    public void run() {
        box.putMessage("Hello from Producer!");
    }
}