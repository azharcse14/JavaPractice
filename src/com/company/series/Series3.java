package com.company.series;

//1.5+2.5+3.5..........+n

import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i, n, sum=0;
        System.out.println("Enter the last number of series: ");
        n = scanner.nextDouble();

        for (i=1.5; i<=n; i++){
            sum = sum+i;
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Sum of series: "+sum);
    }
}
