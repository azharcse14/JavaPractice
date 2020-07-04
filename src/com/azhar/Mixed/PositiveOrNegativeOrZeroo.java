package com.azhar.Mixed;

import java.util.Scanner;

public class PositiveOrNegativeOrZeroo {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        if (num>0){
            System.out.print("POSITIVE");
        }else if (num<0){
            System.out.print("NEGATIVE");
        }else {
            System.out.print("ZERO");
        }
    }
}
