package com.company.array;

public class Array2D {
    public static void main(String[] args) {
        int [][] number = new int[2][3];
        number[0][0]= 22;
        number[0][1]= 22;
        number[0][2]= 22;
        number[1][0]= 22;
        number[1][1]= 22;
        number[1][2]= 22;

        //int sum = 0;

        for (int row =0; row<2; row++){
            for(int col = 0; col<3; col++){
                System.out.print(number[row][col]+" ");
               // sum = number[row][col]+sum;
            }
            System.out.println();
        }
        //System.out.println(sum);
    }

}
