package com.company.array;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {

        int [] number = new int[10];

        number[0] = 10;
        number[1] = 10;
        number[2] = 10;
        number[3] = 10;
        number[4] = 10;
        number[5] = 10;
        number[6] = 100;
        number[7] = 10;
        number[8] = 10;
        number[9] = 10;
        System.out.println(number[8]);
        System.out.println(number[6]+" "+number[8]);
        System.out.println("Length of Array: "+number.length);

        int sum = number[0] + number[1] + number[2] + number[3]+number[4] + number[5]+number[6] + number[7]+number[8] + number[9];
        System.out.println(sum);

        System.out.println(number[0] + number[1] + number[2] + number[3]+number[4] + number[5]+number[6] + number[7] + number[8] + number[9]);
    }
}
