package com.azhar.SubeenProblem52;

import java.util.Scanner;

public class Problem1 {

    //Even Odd

    public static void main(String[] args) {
        int i, n, T;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (i=1; i<=T; i++){
            n= scanner.nextInt();

            if (n%2==0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }
    }
}
