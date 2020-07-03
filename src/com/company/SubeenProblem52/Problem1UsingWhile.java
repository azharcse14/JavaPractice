package com.company;

import java.util.Scanner;

public class Problem1UsingWhile {

    //Even odd
    public static void main(String[] args) {
        int i=1, n, T;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        while (i<=T){
            n = scanner.nextInt();
            if (n%2==0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
            i++;
        }
    }
}
