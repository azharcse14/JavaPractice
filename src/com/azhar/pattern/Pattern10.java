package com.azhar.pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Line number: ");
        int n = scanner.nextInt();

        for (int row =1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.printf(" %c",col+96);

            }

            System.out.println();
        }
    }
}
