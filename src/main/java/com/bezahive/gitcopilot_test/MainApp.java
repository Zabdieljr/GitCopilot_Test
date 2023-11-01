package com.bezahive.gitcopilot_test;

public class MainApp {

    // create a main method
    public static void main(String[] args) {
        // create a new instance of the MainApp class
        MainApp app = new MainApp();
        // call the printHelloWorld method
        app.printHelloWorld();
        app.ifStatementExample();
        app.forLoopExample();
        app.whileLoopExample();
        AIBehavior Aiapp = new AIBehavior();
        Aiapp.convertCelciusToFahrenheit(10);
    }

    private void printHelloWorld() {

        System.out.println("Hello World!");

    }

    // generate an if statement example
    private void ifStatementExample() {

        int x = 5;
        int y = 10;

        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is less than or equal to y");
        }
        // generate another example with variables below
        String name = "John";
        String name2 = "John";

        if (name.equals(name2)) {
            System.out.println("name is equal to name2");
        } else {
            System.out.println("name is not equal to name2");
        }



    }
    // generate a for loop example
    private void forLoopExample() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    // generate a while loop example
    private void whileLoopExample() {

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

    }


}
