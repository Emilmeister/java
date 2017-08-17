package ru.emil.Bank;



/**
 * Create by dinis of 17.08.17.
 */
public class Go {

    Bank bk = new Bank();
    User us = new User();

    public void go(){

       System.out.println("Какая сумма кредита.");
       bk.sum = us.user();
       System.out.println("Какие проценты.");
       double a = us.user(); // zaebalo
       bk.prosents = 1 + (a / 100);
       System.out.println("На сколько лет берете. Не вводите число с запятой или точкой.");
       bk.years = us.user();
       System.out.println("Ежемесечный платеж равен: " + bk.platej() + "   Переплата составит: " + bk.pereplata);


   }

}
