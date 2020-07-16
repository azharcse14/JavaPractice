package com.azhar.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasic {
    public static void main(String[] args) {

        //ArrayList Creation
        ArrayList<Integer> number = new ArrayList<>();

        //Array Size Checking
        System.out.println(number.size());

        //adding elements
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        number.add(90);

        //index wise elements adding
        number.add(7,100);

        //printing array
        System.out.println(number);

        //printing array using foreach loop
        for(int x: number){
            System.out.println(x);
        }

        //printing array using iterator
        Iterator iterator = number.iterator();

        while (iterator.hasNext()){
            System.out.print(" "+iterator.next());
        }
        System.out.println();

        //Removing elements in array list
        number.remove(0);
        System.out.print(number);
        System.out.println();

        //Removing all elements in array list
        number.removeAll(number);
        System.out.println(number);

    }
}
