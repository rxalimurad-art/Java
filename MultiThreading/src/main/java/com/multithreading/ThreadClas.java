package com.multithreading;
import java.lang.*;
public class ThreadClas extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10000; i++)
            for (int j = 0; j < 10000; j++)
                Thread.currentThread().getName();
    }
}
