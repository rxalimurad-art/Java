package com.java.basic;
public class VariablesAndDataTypes {

    // 1 byte
    byte smallNumber = 40;
    // 2 bytes
    short shortNumber = 1000;
    // 4 bytes
    int intNumber = 100000;
    // 8 bytes
    long longNumber = 10000000000L; // 'L' suffix indicates a long literal
    // 4 bytes
    float floatNumber = 10.5f; // 'f' suffix indicates a float literal
    // 8 bytes
    double doubleNumber = 20.99; // no suffix needed for double
    // 2 bytes
    char character = 'A'; // single character
    // 1 byte
    boolean isTrue = true; // true or false value
    // String is not a primitive type, but a reference type
    String text = "Hello, World!"; // a sequence of characters
    // Example of a constant
    final int CONSTANT_NUMBER = 42; // final means this value cannot be changed


    public void printAllVariables() {
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Int: " + intNumber);
        System.out.println("Long: " + longNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Char: " + character);
        System.out.println("Boolean: " + isTrue);
        System.out.println("String: " + text);
        System.out.println("Constant Number: " + CONSTANT_NUMBER);
    }



}
