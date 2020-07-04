package com.azhar.Loop;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i, fact=1;

        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        for (i=num; i>=1;i--){
            fact = fact*i;
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("Factorial of "+num+" = "+fact);
    }
}
