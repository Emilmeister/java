package ru.emil.Tester;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Первый");
        arr.add("Второй");
        arr.add("Третий");
        arr.clear();
        arr.add("Первый");
        arr.add("Второй");

        System.out.println(arr);
        System.out.println(arr.size());


    }


}
