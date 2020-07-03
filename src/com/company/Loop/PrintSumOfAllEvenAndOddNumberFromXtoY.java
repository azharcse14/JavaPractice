package com.company.Loop;

import java.util.Scanner;

public class PrintSumOfAllEvenAndOddNumberFromXtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, sum = 0;
        System.out.print("Enter the initial Value of x: ");
        x= scanner.nextInt();
        System.out.print("Enter the final Value of y: ");
        y= scanner.nextInt();

        for (x=x; x<=y; x=x+2){
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
