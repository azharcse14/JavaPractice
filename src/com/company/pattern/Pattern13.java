package com.company.pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Line number: ");
        int n = scanner.nextInt();

        for (int row =1; row<=n; row++){
            for (int col=1; col<=n-row; col++){
                System.out.printf(" ");

            }
            for (int col=1; col<=row; col++){
                System.out.printf("%c",col+64);

            }

            System.out.println();
        }
    }
}
