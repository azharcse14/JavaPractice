package com.company.Loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int first= 0, second= 1, i, n, fibo;
        System.out.println("How many numbers?");
        n= scanner.nextInt();
        System.out.print(first+" "+second);

        for (i=3; i<=n; i++){
            fibo = first+second;

            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
    }
}
