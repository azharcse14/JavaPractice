package com.azhar.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(7);
        number.add(0);
        number.add(-4);
        number.add(8);
        number.add(-4444);
        number.add(-3333333);
        number.add(12);

        //Ascending
        Collections.sort(number);
        System.out.print(number);

        System.out.println();

        //Descending
        Collections.sort(number,Collections.reverseOrder());
        System.out.print(number);
    }
}
