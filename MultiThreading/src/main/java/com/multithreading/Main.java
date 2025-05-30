package com.multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world!");
        System.out.println(Thread.currentThread().getName());

        ThreadClas class1 = new ThreadClas();
        Thread class2 = new Thread(new RunClas());

        System.out.println(class1.getState());
        class1.start();
        System.out.println(class1.getState());

        // Print the state of the main thread before sleeping
        System.out.println("Main thread state before sleep: " + Thread.currentThread().getState());

        // Simulate some short waiting to allow class1 to proceed
        Thread.sleep(20);
        System.out.println(class1.getState());

        // Print the state of the main thread after calling join()
        System.out.println("Main thread state before join: " + Thread.currentThread().getState());

        // Wait for class1 to finish
        long startTime = System.currentTimeMillis();
        class1.join();
        long endTime = System.currentTimeMillis();

        // Print the state of the main thread after join
        System.out.println("Main thread state after join: " + Thread.currentThread().getState());

        // Calculate the time waited in milliseconds
        long timeWaited = endTime - startTime;
        System.out.println("Time waited (ms): " + timeWaited);

        // Simulate some more waiting after class1 finishes
        Thread.sleep(500);
        System.out.println("Main thread state after second sleep: " + Thread.currentThread().getState());
    }
}
