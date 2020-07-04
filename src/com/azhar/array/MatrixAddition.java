package com.azhar.array;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        System.out.print("Enter the value of row: ");
        i = scanner.nextInt();
        System.out.print("Enter the value of column: ");
        j = scanner.nextInt();

        int[][] A = new int[i][j];
        int[][] B = new int[i][j];

        //Getting input for Matrix A.
        System.out.println("Enter Elements of Matrix A: ");
        for (int row=0; row<i;row++){
            for (int col = 0; col<j; col++){
                System.out.printf("A[%d][%d]=",row,col);
                A[row][col]= scanner.nextInt();
            }
        }

        //Getting input for Matrix B.
        System.out.println("Enter Elements of  Matrix B: ");
        for (int row=0; row<i;row++){
            for (int col = 0; col<j; col++){
                System.out.printf("B[%d][%d]=",row,col);
                B[row][col]= scanner.nextInt();
            }
        }

        //Print Matrix A.
        System.out.println();
        System.out.print("A: ");
        for (int row=0; row<i;row++){
            for (int col = 0; col<j; col++){
                System.out.print("\t "+A[row][col]);
            }
            System.out.println();
        }

        //Print Matrix B.
        System.out.println();
        System.out.print("B: ");
        for (int row=0; row<i;row++){
            for (int col = 0; col<j; col++){
                System.out.print("\t "+B[row][col]);
            }
            System.out.println();
        }

        //Adding A and B Matrix
        System.out.print("A+B= ");
        for (int row=0; row<i;row++){
            for (int col = 0; col<j; col++){
                System.out.print("\t  "+(A[row][col]+B[row][col]));
            }
            System.out.println();
        }
    }
}
