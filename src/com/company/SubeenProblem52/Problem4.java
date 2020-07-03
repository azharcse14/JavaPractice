package com.company.SubeenProblem52;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, N, i, j;

        T = scanner.nextInt();
        for (i =1; i<=T; i++){
            N = scanner.nextInt();
            System.out.print("Case "+i+": ");
            for (j=1; j<=N; j++){
                if (N%j==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
