package com.ferguesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            System.out.println("Invalid input");
            throw new Exception();
        }

        String[] params = input.split(" ");

        if (params.length != 3) {
            System.out.println("Invalid input");
            throw new Exception();
        }


        String result = params.toString();

        return result;
    }
}
