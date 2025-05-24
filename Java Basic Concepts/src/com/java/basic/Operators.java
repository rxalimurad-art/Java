package com.java.basic;

public class Operators {


    public void performOperations() {
        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b)); // Integer division
        System.out.println("Modulus (a % b): " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y (AND): " + (x && y));
        System.out.println("x || y (OR): " + (x || y));
        System.out.println("!x (NOT): " + (!x));

        // 4. Ternary Operator
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("\nTernary Operator:");
        System.out.println("Age " + age + " is an " + result);

        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int num = 5;
        num += 3; // num = num + 3
        System.out.println("After += 3: " + num);

        num *= 2; // num = num * 2
        System.out.println("After *= 2: " + num);

        num -= 4; // num = num - 4
        System.out.println("After -= 4: " + num);

        num /= 2; // num = num / 2
        System.out.println("After /= 2: " + num);

        num %= 3; // num = num % 3
        System.out.println("After %= 3: " + num);
    }
}
