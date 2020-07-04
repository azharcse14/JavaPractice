package com.azhar.Mixed;

import java.util.Scanner;

public class VowelConsonantChecking {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        ch = scanner.next().charAt(0);

        if (ch=='a'){
            System.out.print("Vowel");
        }else if (ch=='e'){
            System.out.print("Vowel");
        }else if (ch=='i'){
            System.out.print("Vowel");
        }else if (ch=='o'){
            System.out.print("Vowel");
        }else if (ch=='u'){
            System.out.print("Vowel");
        }else {
            System.out.print("Consonant");
        }
    }
}
