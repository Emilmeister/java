package ru.emil.Bank;


import java.time.Year;

/**
 * Create by dinis of 17.08.17.
 */
public class Bank {
    public int pereplata = 0;
    public double sum = 0;
    public double prosents = 1;
    public double years = 1;
    public double mounth = 0;
    public double pl = 0;

    public int credit(){

        pereplata = (int) sum;

        sum = sum * Math.pow(prosents, ((years * 12) + mounth));

        for(int i = 0; i < ((years * 12) + mounth); i++) {
            if (i != ((years * 12) + mounth)-1){

                pl += 1;
                pl = pl * prosents;

            }
            if (i == ((years * 12) + mounth)-1){

                pl += 1;

            }

        }

        pereplata = (int) sum - pereplata;

        return (int) (sum/pl);

    }

    public int vklad(){
        double a = 0;
        double b = 0;
        for(int i = (int) (years * 12 + mounth); i > 0 ; i--){
            b = Math.pow(prosents, i);
            a +=b;
        }
        pereplata = (int) (sum * a); //В ообщем
        sum = sum * (years * 12 + mounth); //дают проценты
        sum = pereplata - sum;
        return pereplata;
    }



}
