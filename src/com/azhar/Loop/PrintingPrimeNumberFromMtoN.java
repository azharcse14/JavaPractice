package com.azhar.Loop;

import java.util.Scanner;

public class PrintingPrimeNumberFromMtoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n,i,j, count=0;
        System.out.print("Enter the first value of range: ");
        m=scanner.nextInt();
        System.out.println("Enter the last value of range: ");
        n=scanner.nextInt();

        for (i=m; i<n; i++){
            for (j=2; j<=i-1 ;j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
            }
            count=0;
        }
    }
}
