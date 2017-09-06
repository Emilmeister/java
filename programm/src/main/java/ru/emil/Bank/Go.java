package ru.emil.Bank;



/**
 * Create by dinis of 17.08.17.
 */
public class Go {

    private  Bank bk = new Bank();
    private User us = new User();

    private  String proverka = "";

    public void go(){

       System.out.println("Какая сумма кредита.");
       bk.sum = us.user();
       System.out.println("Какие проценты.");
       double a = us.user(); // zaebalo
       bk.prosents = 1 + (a / 100);
       bk.prosents = Math.pow(bk.prosents, 1.0 / 12);
       System.out.println("На сколько лет берете. Не вводите число с запятой или точкой.");
       bk.years = us.user();
       System.out.println("На сколько(+) месяцев берете. Не вводите число с запятой или точкой.");
       bk.mounth = us.user();
       System.out.println("Если вклад введите что нибудь. Если кредит, то ентер.");
       proverka = us.exit();
       if(proverka.equals("")){
           crdt();
       }else {
           vkld();
       }

   }




    public void crdt(){
        System.out.println("Ежемесечный платеж равен: " + bk.credit() + "   Переплата составит: " + bk.pereplata);
    }

    public void vkld(){
        System.out.println("Сумма в конце срока будет равна: "+ bk.vklad()+ "   Проценты принесут: " + bk.sum);
    }
}
