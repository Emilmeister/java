package ru.emil.Bank;



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
    public int platej(){

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


}
