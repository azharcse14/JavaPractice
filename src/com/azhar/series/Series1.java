package com.azhar.series;

//1+2+3+........+n

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, sum=0;
        System.out.println("Enter the last number of series: ");
        n = scanner.nextInt();

        for (i=1; i<=n; i++){
            sum = sum+i;
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Sum of series: "+sum);
    }
}
