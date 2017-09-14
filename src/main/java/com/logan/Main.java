package com.logan;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String firstInput = input("what is your first number? ");
        String secondInput = input("what is your second number?");
        double output = getDivisionOutput(firstInput, secondInput);
        System.out.println(output);
    }

    public static double getDivisionOutput(String firstInput, String secondInput) {
        return (double) (Double.parseDouble(firstInput) / Double.parseDouble(secondInput));
    }

    public static String input(String prompt){
        System.out.println(prompt);
        String output = scanner.nextLine();
        return output;
    }

}
