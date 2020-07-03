package com.company.Mixed;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();

        if (a%2==0){
            System.out.print("EVEN");
        }else System.out.print("ODD");
    }
}
