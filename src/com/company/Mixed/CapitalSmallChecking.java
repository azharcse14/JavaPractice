package com.company.Mixed;

import java.util.Scanner;

public class CapitalSmallChecking {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        ch = scanner.next().charAt(0);

        if (ch>='A'&& ch<='Z'){
            System.out.print("Capital");
        }else if (ch>='a'&& ch<='z'){
            System.out.print("Small");
        }else {
            System.out.print("Not a letter");
        }

    }
}
