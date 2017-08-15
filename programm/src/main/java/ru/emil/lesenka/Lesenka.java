package ru.emil.lesenka;

import java.util.Random;

/**
 * Create by dinis of 14.08.17.
 */
public class Lesenka {


    Random rn = new Random();

    boolean[] trueFalse;


    public Lesenka(int b){
        trueFalse = new boolean[b];
        int a;
        for (int i = 0; i < trueFalse.length; i++){
            a = rn.nextInt(2);
            //System.out.println(a); // Убрать коммент для вывода правильной последовательности.
            if (a == 1){
                trueFalse[i] = false;
            }
            else{
                trueFalse[i] = true;
            }
        }

    }




}
