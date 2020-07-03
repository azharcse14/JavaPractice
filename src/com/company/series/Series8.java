package com.company.series;

//1^2x2^2x3^2x.......xn^2

import java.util.Scanner;

public class Series8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, result=1;
        System.out.println("Enter the last number of series: ");
        n = scanner.nextInt();

        for (i=1; i<=n; i++){
            result = result*(i*i);
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Sum of series: "+result);
    }
}
