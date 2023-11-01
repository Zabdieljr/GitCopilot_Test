package com.bezahive.gitcopilot_test;
// create class user with a constructor and getters and setters for the name and age and user id

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class VariableExample {
    // create static, instance and local variables and print them
    static int staticVariable = 10;
    int instanceVariable = 20;

    //accessing instance variable from static method
    public static void main(String[] args) {
        VariableExample variableExample = new VariableExample();
        variableExample.method();
        sum(10, 20);
    }


    public void method() {
        int localVariable = 30;
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Local variable: " + localVariable);

    }
    //write a method to sum and print the result of two numbers
    public static void sum(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }


}
