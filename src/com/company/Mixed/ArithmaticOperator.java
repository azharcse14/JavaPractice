package com.company.Mixed;

import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {
        int num1, num2, result;
        double result2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = scanner.nextInt();

        result = num1 + num2;
        System.out.println("Addition :"+result);
        result = num1 - num2;
        System.out.println("Subtraction :"+result);
        result = num1 * num2;
        System.out.println("Multiplication :"+result);
        result2 = (double)num1 / num2;
        System.out.println("Division :"+result2);
        result2 = (double)num1 % num2;
        System.out.print("Percent :"+result2);

    }
}
