package ru.emil.Bank;



/**
 * Create by dinis of 17.08.17.
 */
public class Bank {
    public int pereplata = 0;
    public double sum = 0;
    public double prosents = 1;
    public double years = 1;
    public double pl = 0;
    public int platej(){

        pereplata = (int) sum;

        sum = sum * Math.pow(prosents, years);

        for(int i = 0; i < years;){

            if (i == 0){

                pl += 12;
                i++;

            }
            if ((i != 0)){

                pl *= prosents;
                pl += 12;
                i++;

            }

        }

        pereplata = (int) sum - pereplata;

        return (int) (sum/pl);

    }


}
