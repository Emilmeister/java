package ru.emil.Tasker;

import java.util.ArrayList;

public class Go {

    int    timeLocal = 0;
    int       a;

    // for Tasks
    int    time;
    int    rate;
    String name;

    Scan sc = new Scan();

    public void go(){
        System.out.println("Введите время с которого хотите начать.");
        setTime();
        ArrayList<Task> tasks = new ArrayList<Task>();
        System.out.println("Сколько сегодня у вас задач?");
        a = sc.chislo("1 Или 10?");

        for(int i = 0; i < a; i++){
            System.out.println("Название.");
            name = sc.stroka("lessons?");
            System.out.println("Рейтинг.");
            rate = sc.chislo("12?");
            System.out.println("Время.");
            time = sc.chislo("1500?");
            tasks.add(new Task(name, rate, time));
        }

    }

    // set time
    private void setTime(){
        int a;
        int b;
        a = sc.chislo("exemple 1200");
        b = a % 100;
        a = (a - b)/100;
        time = a*60 + b;
    }
}
