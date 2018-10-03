package com.education;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose the operation: +,-,*,/");
        String operation = scanner.nextLine();

        System.out.println("Enter number 1");
        double number1 = readNumber();
        System.out.println("Enter number 2");
        double number2 = readNumber();
        double result = doOperation(number1, number2, operation);
        System.out.println("Result: " + result);
    }

    public static double doOperation(double number, double number1, String operation) {
        if (operation.equals("+")) {
            return number + number1;
        } else if (operation.equals("-")) {
            return number - number1;
        } else if (operation.equals("*")) {
            return number * number1;
        } else if (operation.equals("/")) {
            return number / number1;
        } else {
            return 0;
        }
    }

    public static double readNumber() {
        double number = 0;
        try {
            number = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("FATAL ERROR. Try numbers");
            System.exit(-1);
        }
        return number;
    }
}
