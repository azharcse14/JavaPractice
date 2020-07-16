package com.azhar.ArrayList;

import java.util.ArrayList;

public class EqualsMethod {

    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        number1.add(50);
        number1.add(60);

        System.out.println(number1);

        number2.add(22);
        number2.add(23);
        number2.add(24);
        number2.add(25);
        number2.add(26);
        number2.add(27);
        number2.add(28);

        System.out.println(number2);

        number3.addAll(number1);
        System.out.println(number3);

        boolean result = number1.equals(number3);
        System.out.println(result);
    }
}
