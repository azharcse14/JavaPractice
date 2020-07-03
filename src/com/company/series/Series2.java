package com.company.series;

//1+3+5+........+n

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, sum=0;
        System.out.println("Enter the last number of series: ");
        n = scanner.nextInt();

        for (i=1; i<=n; i=i+2){
            sum = sum+i;
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Sum of series: "+sum);
    }
}
