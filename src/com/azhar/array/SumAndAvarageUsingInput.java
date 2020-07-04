package com.azhar.array;

import java.util.Scanner;

public class SumAndAvarageUsingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        double number[] = new double[5],sum =0, avarage;

        System.out.println("Pls enter five number: ");
        number[0]= scanner.nextDouble();
        number[1]= scanner.nextDouble();
        number[2]= scanner.nextDouble();
        number[3]= scanner.nextDouble();
        number[4]= scanner.nextDouble();

        sum = number[0] +
                number [1] +
                number [2] +
                number [3] +
                number [4] ;

        System.out.println("Sum is: "+sum);

        avarage = sum/number.length;
        System.out.println("Avarage: "+avarage);
    }
}
