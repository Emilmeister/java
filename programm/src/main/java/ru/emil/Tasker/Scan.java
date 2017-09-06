package ru.emil.Tasker;

import java.util.Scanner;

public class Scan {
    Scanner sc = new Scanner(System.in);

    // input String
    public String stroka(String a){
        System.out.println("Вводите (" + a + ")");
        String rtrn = sc.nextLine();
        return rtrn;
    }

    // input int number
    public int chislo(String a){
        System.out.println("Вводите (" + a + ")");
        int c = -1;
        do {
            try {
                c = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Вы ввели не целое число! Заного.");
            }
        }while (c == -1);
        return c;
    }
}
