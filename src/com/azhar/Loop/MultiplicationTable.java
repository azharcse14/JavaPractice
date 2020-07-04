package com.azhar.Loop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num, i;
        System.out.print("Enter Multiplication Number: ");
        num= scanner.nextInt();

        for (i=1;i<=10;i++){
            if (i<10){
                System.out.println(num +" x  "+i+" = "+num*i);
            }else {
                System.out.println(num + " x " + i + " = " + num * i);
            }
        }
    }
}
