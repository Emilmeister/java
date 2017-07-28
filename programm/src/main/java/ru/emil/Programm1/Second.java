package ru.emil.Programm1;

/**
 * Created by dinis on 27.07.17.
 */
public class Second {
    public static String open(){
        double a = Math.ceil(Math.random() * 100);
        String variable ="";
        if ( a <= 64 ) {
            variable = "Юмп 45 Капрал";
            First.balanse += 10;
            First.vipadenie[0]++;
        }else{
            if ( a <= 84 ){
                variable = "Дигл Нага";
                First.vipadenie[1]++;
                First.balanse += 40;
            }else{
                if ( a <= 94 ){
                   variable = "\t\tАвп Элитное снараяжение";
                    First.vipadenie[2]++;
                    First.balanse += 300;
                }else{
                    if ( a <= 99 ){
                        variable = "\t\t\t\t\t\tАк47 Аквамариновая месть";
                        First.vipadenie[3]++;
                        First.balanse += 800;
                    }else
                        if ( a == 100 ){
                            variable = "\t\t\t\t\t\t\t\t\t\t\t\t\tКерамбит Кровавая паутина";
                            First.vipadenie[4]++;
                            First.balanse += 7000;
                        }
                }
            }
        }
        return variable;
    }
}
