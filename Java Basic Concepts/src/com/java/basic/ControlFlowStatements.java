package com.java.basic;

public class ControlFlowStatements {

    public void demonstrateControlFlow() {
        int number = 10;
        if (number > 4) {
            System.out.println("Number is greater than 4");
        } else if (number == 4) {
            System.out.println("Number is equal to 4");
        } else {
            System.out.println("Number is less than 4");
        }


        while (number > 0) {
            System.out.println("Current number: " + number);
            number--;
        }
        do  {
            System.out.println("Current number in do-while: " + number);
            number++;
        } while (number <= 10);

        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }

}
