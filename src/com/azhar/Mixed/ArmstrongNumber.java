package com.azhar.Mixed;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reminder, num, temp, sum=0;
        System.out.print("Enter the Number: ");
        num = scanner.nextInt();
        temp = num;

        while (temp!=0){
            reminder = temp%10;
            sum = sum+reminder*reminder*reminder;
            temp = temp/10;
        }
        if (num==sum) {
            System.out.println(sum + " is Armstrong.");
        }else {
            System.out.println(" is not Armstrong.");
        }
    }
}
