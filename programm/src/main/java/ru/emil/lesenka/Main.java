package ru.emil.lesenka;

/**
 * Create by dinis of 14.08.17.
 */
public class Main {

    public static void main(String[] args) {

        User us = new User();
        String a;
        Go go = new Go();
        do {
            go.go();
            System.out.println("Для продолжения нажмите ентр, для выхода введите что хотите.");
            a = us.in();
        }
        while (a.equals(""));
    }

}
