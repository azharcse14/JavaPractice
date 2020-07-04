package com.azhar.array;

import java.util.Scanner;

public class SumOfUpperTriangleElementsOfaMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] A = new int[3][3];
        int SumOfUpperTriangleElements = 0;

        System.out.println("Input the Matrix: ");
        for (int row = 0; row<3; row++){
            for (int col =0; col<3; col++){
                A[row][col]= scanner.nextInt();
            }
        }

        for (int row = 0; row<3; row++){
            for (int col =0; col<3; col++){
                if (row>col){
                    SumOfUpperTriangleElements = SumOfUpperTriangleElements + A[row][col];
                }
            }
        }
        System.out.println("Sum Of Upper Triangle Elements: "+SumOfUpperTriangleElements);
    }
}
