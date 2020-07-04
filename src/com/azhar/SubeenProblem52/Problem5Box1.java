package com.azhar.SubeenProblem52;

import java.util.Scanner;

public class Problem5Box1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, row, col, T , N;
        T = scanner.nextInt();
        for (i=1; i<=T; i++){
            N = scanner.nextInt();
            for (row =1; row<=N; row++){
                for (col=1; col<= N; col++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
