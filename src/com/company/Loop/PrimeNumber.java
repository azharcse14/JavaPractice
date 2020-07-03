package com.company.Loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num, i, count=0;
        System.out.print("Enter the checking Number: ");
        num= scanner.nextInt();

        for (i=2;i<num;i++){
            if (num%i==0){
                count++;
                break;

            }
        }
        if (count==0){
            System.out.print(num+" is Prime number.");
        }else {
            System.out.println(num+" is not a prime number.");
        }
    }
}
