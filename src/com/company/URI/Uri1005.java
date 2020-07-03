package com.company.URI;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        double A, B, SUM, AVG;
        Scanner scanner = new Scanner(System.in);
        A= scanner.nextDouble();
        B= scanner.nextDouble();

        SUM = A + B;
        AVG = SUM/2;
        System.out.printf("MEDIA = %.10f",AVG);
        System.out.println();
    }
}
