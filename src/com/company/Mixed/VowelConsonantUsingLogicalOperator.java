package com.company.Mixed;

import java.util.Scanner;

public class VowelConsonantUsingLogicalOperator {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        ch = scanner.next().charAt(0);

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.print("Vowel");
        }else {
            System.out.print("Consonant");
        }
    }
}
