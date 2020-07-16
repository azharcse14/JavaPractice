package com.azhar.ArrayList;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList <String> student = new ArrayList<>();

        student.add("Arafat");
        student.add("Sarafat");
        student.add("Atik");
        student.add("Atika");
        student.add("Arif");
        student.add("Atahar");

        System.out.println(student);

        //ArrayList Clear
        student.clear();
        System.out.println(student);
    }
}
