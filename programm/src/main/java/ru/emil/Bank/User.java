package ru.emil.Bank;


import java.util.Scanner;

/**
 * Create by dinis of 17.08.17.
 */
public class User {

    Scanner sc = new Scanner(System.in);
    public double user(){
        double c = 0;
        System.out.println("Введите число.");
        String a = sc.nextLine();
        try {

            c = Double.parseDouble(a);

        }
        catch (Exception E){

            System.out.println("Ошибка ввода.");

        }
        return c;



    }

    public String exit(){

        return sc.nextLine();

    }
}
