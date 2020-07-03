package com.company.Mixed;

import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double  area;
        //Square
        double s;
        System.out.print("Enter the Area of Square: ");
        s= scanner.nextDouble();
        area = s*s;
        System.out.println("Area of Square: "+area);

        //Rectangle
        double l, w;
        System.out.print("Enter the Length of Area: ");
        l= scanner.nextDouble();
        System.out.print("Enter the Width of Area: ");
        w= scanner.nextDouble();
        area = l*w;
        System.out.println("Area of Rectangle: "+area);

        //Triangle
        double b, h;
        System.out.print("Enter the Base of Area: ");
        b= scanner.nextDouble();
        System.out.print("Enter the Height of Area: ");
        h= scanner.nextDouble();
        area = 0.5*b*h;
        System.out.println("Area of Triangle: "+area);

        //Circle
        double r;
        System.out.print("Enter the Radius of Area: ");
        r= scanner.nextDouble();
        area = 3.1416*r*r;
        System.out.println("Area of Circle: "+area);




    }
}
