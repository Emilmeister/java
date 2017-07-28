package ru.emil.cscard;

import java.sql.SQLOutput;
import java.util.Set;

/**
 * Created by dinis on 23.07.17.
 */
public class Print {
    Calculate calculate = new Calculate();
    Set set = calculate.generateSet();
    //Start st = new Start();
    public void nachalo() {
        System.out.println("Введите  три числа для выбора позиций предмета, как показано на рисунке.\n[1] [2] [3]\n[4] [5] [6]\n[7] [8] [9]");
    }

    public void sravnenie(){

       // System.out.println("Вы ввели: " + st.a1 + " " + st.b1 + " " + st.c1 + ";");
    }
    public void osnova(){
        System.out.println(this.set);
      for (int i = 1 ; i <= 9 ; i++) {
          if ( (i % 3) == 0 ) {
              if( this.set.contains ( i )) {
                  System.out.println("[X]");
              }
              else{
                  System.out.println("[" + i + "]");
              }
          } else {
              if( this.set.contains( i )) {
                  System.out.print("[X] ");
              }
              else{
                  System.out.print("[" + i + "] ");
              }
          }
      }
    }

}
