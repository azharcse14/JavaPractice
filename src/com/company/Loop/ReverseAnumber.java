package com.company.Loop;

import java.util.Scanner;

public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reminder, num, temp, sum=0;
        System.out.print("Enter the Number: ");
        num = scanner.nextInt();
        temp = num;

        while (temp!=0){
            reminder = temp%10;
            sum = sum*10+reminder;
            temp = temp/10;
        }
        System.out.println("Reverse Number: "+sum);
    }
}
