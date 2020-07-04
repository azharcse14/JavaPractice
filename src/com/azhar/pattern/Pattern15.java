package com.azhar.pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Line number: ");
        int n = scanner.nextInt();

        for (int row =1; row<=n; row++){
            for (int col=1; col<=n; col++){
                System.out.print(" * "+row);
            }

            System.out.println();
        }
    }
}
