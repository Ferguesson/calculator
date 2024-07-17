package com.ferguesson;

import java.util.Scanner;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an arithmetic expression");
        System.out.println("which consists of the two whole numbers from 1 to 10");
        System.out.println("an operator between them: +, -, *, /");
        System.out.println("all separated by spaces.");
        System.out.println();

        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(input + " = " + result);
    }

    public static String calc(String input) throws Exception {
        if (input.isEmpty()) {
            System.out.println("Empty input");
            throw new Exception();
        }

        String[] params = input.split(" ");

        if (params.length != 3) {
            System.out.println("Invalid number of parameters");
            throw new Exception();
        }

        int operand1;
        int operand2;
        String operator = params[1];

        try {
            operand1 = Integer.parseInt(params[0]);
            operand2 = Integer.parseInt(params[2]);
        }
        catch (Exception e) {
            System.out.println("Operands must be integers");
            throw new Exception();
        }

        if ((operand1 < 1 || operand1 > 10) && (operand2 < 1 || operand2 > 10)) {
            System.out.println("Both operands are not between 1 and 10");
            throw new Exception();
        }

        if (operand1 < 1 || operand1 > 10) {
            System.out.println("First operand is not between 1 and 10");
            throw new Exception();
        }

        if (operand2 < 1 || operand2 > 10) {
            System.out.println("Second operand is not between 1 and 10");
            throw new Exception();
        }

        String result;
        int arithmetic;

        switch (operator) {
            case "+":
                arithmetic = operand1 + operand2;
                break;
            case "-":
                arithmetic = operand1 - operand2;
                break;
            case "*":
                arithmetic = operand1 * operand2;
                break;
            case "/":
                arithmetic = operand1 / operand2;
                break;

            default:
                System.out.println("Invalid operator");
                throw new Exception();
        }

        result = Integer.toString(arithmetic);
        return result;
    }
}
