package com.azhar.Mixed;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x, y;
        System.out.print("Enter a value of X: ");
        x= scanner.nextInt();
        System.out.print("Enter a value of Y: ");
        y= scanner.nextInt();

        x+=y;
        System.out.println("AX= "+x);
        x-=y;
        System.out.println("SX= "+x);
        x*=y;
        System.out.println("MX= "+x);
        x/=y;
        System.out.println("DX= "+x);
        x%=y;
        System.out.println("PX= "+x);
    }
}
