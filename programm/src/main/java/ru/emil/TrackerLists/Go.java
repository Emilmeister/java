package ru.emil.TrackerLists;

import java.util.Scanner;

public class Go {
    String toScan1 = "";
    String toScan2 = "";
    String toScan3 = "";

    Tracker track = new Tracker();

    Scanner sc = new Scanner(System.in);
    public void init(){
        String  s = "";
        /*
        toScan1 = sc.nextLine();
        track.addObject(toScan1);
        toScan1 = sc.nextLine();
        track.addObject(toScan1);
        toScan1 = sc.nextLine();
        track.addNewProperty(toScan1);
        toScan1 = sc.nextLine();
        toScan2 = sc.nextLine();
        toScan3 = sc.nextLine();
        track.setPropertyOfObject(toScan1, toScan2, toScan3);
        track.getObjectsAndPropertys();
        */
        do {
            System.out.println("[1] Добавть новй оюъект.\n[2] Добавить новое свойство. \n[3]Добавить свойство объекта.\n[4] Получить свойство объекта.\n[5] Получить таблицу объектов и их свойсв.");

            System.out.println("Введите что-то для продолжения. Для выхода энтер.");
        }while(!(s.equals("")));

    }
}
