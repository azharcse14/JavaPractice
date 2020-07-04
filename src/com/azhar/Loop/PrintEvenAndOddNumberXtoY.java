package com.azhar.Loop;

import java.util.Scanner;

public class PrintEvenAndOddNumberXtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.print("Enter the Value of x: ");
        x= scanner.nextInt();
        System.out.print("Enter the Value of y: ");
        y= scanner.nextInt();

        for (x=x; x<=y; x=x+2){
            System.out.println(x+" : Bangladesh");
        }
    }
}

//Note: Input even diye suru korle even hobe, odd diye suru korle odd hobe.
