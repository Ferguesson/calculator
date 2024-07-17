package com.ferguesson;

import java.util.Scanner;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
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

    public static String calc(String input) {
        String result = input.toUpperCase();

        return result;
    }
}
