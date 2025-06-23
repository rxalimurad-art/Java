package com.java.consumerprod;


public class MessageBox {
        private String message;
        private boolean hasMessage = false;

        public synchronized void putMessage(String msg) {
            System.out.println("[Producer] Trying to put message...");

            while (hasMessage) {
                System.out.println("[Producer] Message already present. Waiting...");
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("[Producer] Woke up. Rechecking condition...");
            }

            message = msg;
            hasMessage = true;
            System.out.println("[Producer] Put message: " + msg);
            notifyAll();
        }

        public synchronized String getMessage() {
            System.out.println("[Consumer] Trying to get message...");

            while (!hasMessage) {
                System.out.println("[Consumer] No message yet. Waiting...");
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("[Consumer] Woke up. Rechecking condition...");
            }

            hasMessage = false;
            System.out.println("[Consumer] Got message: " + message);
            notifyAll();
            return message;
        }
    }


