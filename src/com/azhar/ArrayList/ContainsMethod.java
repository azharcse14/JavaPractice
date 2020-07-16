package com.azhar.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainsMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> number = new ArrayList<>();

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

        System.out.print("Enter the number: ");

        Double num = scanner.nextDouble();

        //

        Boolean b = number.contains(num);

        System.out.println(b);
    }
}
