package com.azhar.ArrayList;

import java.util.ArrayList;

public class GetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(33);
        number.add(24);
        number.add(45);
        number.add(30);
        number.add(75);
        number.add(55);
        number.add(31);
        number.add(49);
        number.add(3332);

        int s = number.get(0);
        System.out.println(s);
    }
}
