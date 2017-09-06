package ru.emil.lesenka;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Create by dinis of 14.08.17.
 */
public class Go {

    boolean[] check;
    int coins;

    User user = new User();

    public void go(){



        int viborka = 0;


        System.out.println("Введите число ваших выборок. Не больше 10.");

        try{

            viborka = Integer.parseInt(user.in());

        }
        catch (Exception E){

            System.out.println("Ошибка ввода");

        }

        System.out.println("Введите вашу ставку. Ваш баланс: " + user.getBalance());
        try{


            coins = Integer.parseInt(user.in());

        }
        catch (Exception E){

            System.out.println("Ошибка ввода");

        }

        if (coins <= user.getBalance()) {

            if (viborka != 0) {

                Lesenka lesenka = new Lesenka(viborka);
                check = new boolean[viborka];

                System.out.println("Чтобы выбрать 1 нажми энтер и нечего не вводи, а чтобы выбрать 2 введи что-нибудь.");

                String info;
                for (int i = 0; i < viborka; i++) {
                    info = user.in();

                    if (info.equals("")) {
                        check[i] = true;
                    } else {
                        check[i] = false;
                    }
                }

                if (Arrays.equals(lesenka.trueFalse, check)) {

                    user.setBalance(coins);
                    user.setBalance((int) Math.pow(2, viborka) * coins / 2);
                    System.out.println("Все правильно. Ваш баланс пополнился на " + ((int) Math.pow(2, viborka) * coins) + ". Ваш баланс: " + user.getBalance());

                } else {

                    user.setBalance(-coins);
                    System.out.println("Где то есть несоответствие. Ваш взнос перечислен нам на счет. Ваш баланс: " + user.getBalance());

                }

                lesenka = null;
                viborka = 0;

            } else {

                System.out.println("Нужно вводить число, кроме нуля.");

            }
        }
        else {
            System.out.println("У вас не достаточно денег на балансе.");
        }
    }

}
