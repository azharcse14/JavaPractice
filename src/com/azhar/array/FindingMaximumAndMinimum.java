package com.azhar.array;

import java.util.Scanner;

public class FindingMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size;
        System.out.print("Enter the array size: ");
        size = scanner.nextInt();

        System.out.println();


        double number[] = new double[size];

        for (int i =0; i<number.length; i++){
            if (i+1==1){
                System.out.print("Enter the "+(i+1)+"st number: ");
            }else if(i+1==2){
                System.out.print("Enter the "+(i+1)+"nd number: ");
            }
            else if(i+1==3){
                System.out.print("Enter the "+(i+1)+"rd number: ");
            }else if(i+1>=4){
                System.out.print("Enter the "+(i+1)+"th number: ");
            }else {
                System.out.print("Enter the " +(i+1)+ " number: ");
            }
            number[i] = scanner.nextDouble();
        }

        System.out.println();

        double max = number[0], min = number[0];

        for (int i=0; i<number.length; i++){
            if (max<number[i]){
                max =number[i];
            }
            if (min>number[i]){
                min =number[i];
            }
        }

        System.out.println("Maximum Number is: "+max);
        System.out.println("Minimum Number is: "+min);
    }
}
