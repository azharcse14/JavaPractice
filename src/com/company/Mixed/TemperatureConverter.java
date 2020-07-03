package com.company.Mixed;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double c, f;
        //Celsius(c) to Fahrenheit(f)
        //F = 9/5*C+32
        //....9/5=1.8
        System.out.print("Enter the Celsius: ");
        c = scanner.nextDouble();
        f = 1.8*c+32;
        System.out.println("Fahrenheit: "+f);

        //Fahrenheit(f) to Celsius(c)
        //C = 5/9*(C-32)
        //...5/9= 0.5555555555555556
        System.out.print("Enter the Fahrenheit: ");
        f = scanner.nextDouble();
        c = 0.5555555555555556*(c-32);
        System.out.print("Celsius: "+c);


    }
}
