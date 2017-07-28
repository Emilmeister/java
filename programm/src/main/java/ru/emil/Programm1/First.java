package ru.emil.Programm1;

import java.awt.*;

/**
 * Created by dinis on 27.07.17.
 */
public class First {

    public static double balanse= 0;
    public static int[] vipadenie = new  int[5];
    public static void main ( String[] args ){
        int a= 0;
        int cases = 100;
        while ( a < cases ){
            System.out.println(Second.open());
            a++;
        }
        System.out.println("\n\nsinego " + vipadenie[0]);
        System.out.println("fioletovogo " + vipadenie[1]);
        System.out.println("rozovogo " + vipadenie[2]);
        System.out.println("krasnogo " + vipadenie[3]);
        System.out.println("nozei " + vipadenie[4]);
        System.out.println("deneg potracheno na cluchi: " + cases * 150 + "rub" );
        System.out.println("Polucheno skinami: " + balanse );
        System.out.println("PROFIT: " + (balanse - (cases * 150)) );
    }
}
