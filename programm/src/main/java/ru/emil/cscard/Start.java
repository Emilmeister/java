package ru.emil.cscard;

import java.util.PrimitiveIterator;
import java.util.Set;

/**
 * Created by dinis on 23.07.17.
 */
/*
public class Start {
    //Print pr = new Print();
    In v = new In();
    Calculate calc = new Calculate();
    public int a ;
    public int b ;
    public int c ;
    public int a1 ;
    public int b1 ;
    public int c1 ;

    public Start() {
        this.initNumbers();
    }

    public void initNumbers() {
        this.a = this.calc.rdm();
        this.b = this.calc.rdm();
        this.c = this.calc.rdm();
    }


    public void init() {
        a = calc.rdm();
        b = calc.rdm();
        c = calc.rdm();
        //pr.nachalo();
        a1 = Integer.parseInt(v.vvod());
        b1 = Integer.parseInt(v.vvod());
        c1 = Integer.parseInt(v.vvod());
        //pr.sravnenie();
        //pr.osnova();

    }

}
*/
public class Start{
    Print print = new Print();
    Calculate calculate = new Calculate();
    public void go(){
        print.nachalo();
        Set<Integer> set = calculate.generateSet();
        print.osnova();
    }
}