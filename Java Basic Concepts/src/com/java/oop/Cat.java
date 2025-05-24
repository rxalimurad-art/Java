package com.java.oop;

public class Cat extends Animal {
    public Cat(int age) {
        super(age);
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}