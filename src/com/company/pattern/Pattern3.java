package com.company.pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Line number: ");
        int n = scanner.nextInt();

        for (int row =n; row>=1; row--){
            for (int col=1; col<=row; col++){
                System.out.print(" "+col);
            }

            System.out.println();
        }
    }
}
