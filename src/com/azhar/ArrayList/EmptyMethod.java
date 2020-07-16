package com.azhar.ArrayList;

import java.util.ArrayList;

public class EmptyMethod {
    public static void main(String[] args) {
        ArrayList <Double> number = new ArrayList<>();

        number.add(1.3);
        number.add(3.3);
        number.add(2.4);
        number.add(4.5);
        number.add(3.0);
        number.add(7.5);
        number.add(5.5);
        number.add(3.01);
        number.add(4.9);
        number.add(33.32);

       // number.clear();

        Boolean b = number.isEmpty();

        System.out.println(b);
    }
}
