package com.company.series;

//1x3x5x...........xn

import java.util.Scanner;

public class Series6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, result=1;
        System.out.println("Enter the last number of series: ");
        n = scanner.nextInt();

        for (i=1; i<=n; i=i+2){
            result = result*i;
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Sum of series: "+result);
    }
}
