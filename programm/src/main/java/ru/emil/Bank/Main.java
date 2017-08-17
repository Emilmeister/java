package ru.emil.Bank;



/**
 * Create by dinis of 17.08.17.
 */
public class Main {




    public static void main(String[] args) {

        User us = new User();

        String check = "";

        do {
            System.out.println("Вы открыли программу расчета кредитов.");
            Go go = new Go();
            go.go();
            System.out.println("Для выхода введите чтото, для продолжения ентер.");
            check = us.exit();
        }
        while (check.equals(""));
    }

}
