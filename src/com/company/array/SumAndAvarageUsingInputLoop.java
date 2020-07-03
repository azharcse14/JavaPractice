package com.company.array;

import java.util.Scanner;

public class SumAndAvarageUsingInputLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int size;
        System.out.print("Enter the array size: ");
        size = scanner.nextInt();

        System.out.println();


        double number[] = new double[size],sum =0, avarage;

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


        for (int i=0;i<number.length;i++){
            sum = sum + number[i];

        }
        System.out.println("Sum is: "+sum);

        avarage = sum/number.length;
        System.out.println("Avarage: "+avarage);

    }
}
