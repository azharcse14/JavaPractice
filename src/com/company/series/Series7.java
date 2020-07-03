package com.company.series;

//1.5x2.5x3.5x.......xn

import java.util.Scanner;

public class Series7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i, n, result=1;
        System.out.println("Enter the last number of series: ");
        n = scanner.nextDouble();

        for (i=1.5; i<=n; i++){
            result = result*i;
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Sum of series: "+result);
    }
}
