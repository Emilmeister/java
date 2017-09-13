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
        int a = 1;
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
            System.out.println("[1] Добавить новый объект.\n[2] Добавить новое свойство. \n[3]Добавить свойство объекта.\n[4] Получить свойство объекта.\n[5] Получить таблицу объектов и их свойсв.\n\nВведите что вам нужно. Для выхода ентер. ");
            if(!(s.equals(""))) {
                do {
                    try {
                        s = sc.nextLine();
                        a = Integer.parseInt(s);
                    } catch (Exception E) {
                        System.out.println("Не понял. Введи снова.");
                        s = sc.nextLine();
                        a = Integer.parseInt(s);
                    }
                }while(s.equals(""));
            }
            switch (a){
                case 1: {
                    System.out.println("Введите имя объекта. ");
                    toScan1 = sc.nextLine();
                    track.addObject(toScan1);
                }
                case 2:{
                    System.out.println("Введите название свойства.");
                    toScan1 = sc.nextLine();
                    track.addNewProperty(toScan1);
                }
                case 3:{
                    System.out.println("Введите номер объекта.");
                    toScan1 = sc.nextLine();
                    System.out.println("Введите название свойство.");
                    toScan2 = sc.nextLine();
                    System.out.println("Введите добавочное значение.");
                    toScan3 = sc.nextLine();
                    track.setPropertyOfObject(toScan2,toScan3,toScan1);
                }
                case 4:{
                    System.out.println("Введите имя объекта.");
                    toScan1 = sc.nextLine();
                    System.out.println("Введите название свойство.");
                    toScan2 = sc.nextLine();
                    track.getPropertyOfObject(toScan1,toScan2);
                }
                case 5:{
                    track.getObjectsAndPropertys();
                }
            }
            System.out.println("Введите что-то для продолжения. ");
        }while(!(s.equals("")));

    }
}
