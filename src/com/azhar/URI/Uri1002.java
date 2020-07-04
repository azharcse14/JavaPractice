package com.azhar.URI;

import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        double A, pi = 3.14159, R;
        Scanner scanner = new Scanner(System.in);
        R= scanner.nextDouble();

        A= pi*R*R;
        System.out.printf("A=%.4f",A);
        System.out.println();

    }
}
