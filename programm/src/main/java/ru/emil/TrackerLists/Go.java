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
            System.out.println("\n[1] Добавить новый объект.\n[2] Добавить новое свойство. \n[3] Добавить свойство объекта.\n[4] Получить свойство объекта.\n[5] Получить таблицу объектов и их свойсв.\n[6] Для замены имен объектов.\n[7] Для ввода нескольких объектов.\n\nВведите что вам нужно. Для выхода ентер. ");
            s = sc.nextLine();
            if(!(s.equals(""))) {
                do {
                    try {
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
                    System.out.println("Введите имя объекта.");
                    toScan1 = sc.nextLine();
                    track.addObject(toScan1);
                    break;
                }
                case 2:{
                    System.out.println("Введите название свойства.");
                    toScan1 = sc.nextLine();
                    track.addNewProperty(toScan1);
                    break;
                }
                case 3:{
                    System.out.println("Введите номер объекта.");
                    toScan1 = sc.nextLine();
                    System.out.println("Введите название свойства.");
                    toScan2 = sc.nextLine();
                    System.out.println("Введите добавочное значение.");
                    toScan3 = sc.nextLine();
                    track.setPropertyOfObjectPrpName(toScan2,toScan3,toScan1);
                    break;
                }
                case 4:{
                    System.out.println("Введите имя объекта.");
                    toScan1 = sc.nextLine();
                    System.out.println("Введите название свойства.");
                    toScan2 = sc.nextLine();
                    System.out.println(track.getPropertyOfObject(toScan1,toScan2));
                    break;
                }
                case 5:{
                    track.getObjectsAndPropertys();
                    break;
                }
                case 6:{
                    System.out.println("Введите номер объекта.");
                    toScan1 = sc.nextLine();
                    System.out.println("Введите новое имя.");
                    toScan2 = sc.nextLine();
                    track.remakeNameofObject(toScan1,toScan2);
                }

                case 7:{
                    int var = 1;
                    System.out.println("Сколько объектов вы хотите создать?");
                    toScan1 = sc.nextLine();
                    try{
                        var = Integer.parseInt(toScan1);
                    }catch (Exception E){
                        System.out.println("Неправильно введено число. Введите еще раз.");
                        toScan1 = sc.nextLine();
                        var = Integer.parseInt(toScan1);
                    }
                    for (int i = 0; i < var; i++ ) {
                        toScan2 = sc.nextLine();
                        track.addObject(toScan2);
                    }
                }
            }
        }while(!(s.equals("")));

    }
}
