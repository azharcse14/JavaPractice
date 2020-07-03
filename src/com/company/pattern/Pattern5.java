package com.company.pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Line number: ");
        int n = scanner.nextInt();

        for (int row =1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
