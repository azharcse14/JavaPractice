package com.azhar.pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Line number: ");
        int n = scanner.nextInt();

        for (int row =1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.printf(" %c",row+64);

            }

            System.out.println();
        }
    }
}
