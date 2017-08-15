package ru.emil.lesenka;

import java.util.Scanner;

/**
 * Create by dinis of 14.08.17.
 */
public class User {

    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int a){
        balance += a;
    }

    Scanner sc = new Scanner(System.in);

    public String in(){
        return sc.nextLine();
    }
}
