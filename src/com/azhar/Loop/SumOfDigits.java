package com.azhar.Loop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reminder, num, temp, sum=0;
        System.out.print("Enter the DIGIT: ");
        num = scanner.nextInt();
        temp = num;

        while (temp!=0){
            reminder = temp%10;
            sum = sum+reminder;
            temp = temp/10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
