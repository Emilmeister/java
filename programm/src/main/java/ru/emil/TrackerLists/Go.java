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
            System.out.println("" +
                    "\n[1]  Добавить новый объект.\t\t\t\t\t\t\t\t["+ track.simbols + "]" +
                    "\n[2]  Добавить новое свойство. " +
                    "\n[3]  Добавить свойство объекта." +
                    "\n[4]  Получить свойство объекта." +
                    "\n[5]  Получить таблицу объектов и их свойсв." +
                    "\n[6]  Для замены имен объектов." +
                    "\n[7]  Для добавления нескольких объектов." +
                    "\n[8]  Для добавления нескольких свойств." +
                    "\n[9]  Для ввода всех свойст объекта."+
                    "\n[10] Для смены кол-ва символов в ячейке."+
                    "\n\nВведите что вам нужно. Для выхода ентер. ");
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
                    switch (a){
                        case 1:addObject(); break;

                        case 2:addProperty();break;

                        case 3:setPropetryOfObject();break;

                        case 4:getPropetryOfObject();break;

                        case 5:track.getObjectsAndPropertys();break;

                        case 6:remakeNameofObject();break;

                        case 7:manyObjects();break;

                        case 8:manyPropretis();break;

                        case 9:fillTheObject();break;

                        case 10:remakeString();break;//  remake

                        case 11:delObject();break;
                    }
                }while(s.equals(""));
            }
        }while(!(s.equals("")));

    }

    private void manyObjects(){
        int var = -1;
        System.out.println("Сколько объектов вы хотите создать?");
        toScan1 = sc.nextLine();
        do {
            try {
                var = Integer.parseInt(toScan1);
            } catch (Exception E) {
                System.out.println("Неправильно введено число. Введите еще раз.");
                toScan1 = sc.nextLine();
                var = Integer.parseInt(toScan1);
            }
        }while(var == -1);
        for (int i = 0; i < var; i++ ) {
            System.out.print("Обьект "+ (i+1) +":");
            toScan2 = sc.nextLine();
            track.addObject(toScan2);
            System.out.print("\n");
        }

    }

    private void manyPropretis() {
        int var = -1;
        System.out.println("Сколько свойств вы хотите создать?");
        toScan1 = sc.nextLine();
        do {
            try {
                var = Integer.parseInt(toScan1);
            } catch (Exception E) {
                System.out.println("Неправильно введено число. Введите еще раз.");
                toScan1 = sc.nextLine();
                var = Integer.parseInt(toScan1);
            }
        }while(var == -1);
        for (int i = 0; i < var; i++ ) {
            toScan2 = sc.nextLine();
            track.addNewProperty(toScan2);
        }
    }

    private void remakeNameofObject(){
        System.out.println("Введите номер объекта.");
        toScan1 = sc.nextLine();
        System.out.println("Введите новое имя.");
        toScan2 = sc.nextLine();
        track.remakeNameofObject(toScan1,toScan2);
    }

    private void getPropetryOfObject(){
        System.out.println("Введите номер объекта.");
        toScan1 = sc.nextLine();
        System.out.println("Введите название свойства.");
        toScan2 = sc.nextLine();
        System.out.println(track.getPropertyOfObject(toScan1,toScan2));
    }

    private void setPropetryOfObject(){
        System.out.println("Введите номер объекта.");
        toScan1 = sc.nextLine();
        System.out.println("Введите название свойства.");
        toScan2 = sc.nextLine();
        System.out.println("Введите добавочное значение.");
        toScan3 = sc.nextLine();
        track.setPropertyOfObjectPrpName(toScan2,toScan3,toScan1);
    }

    private void addProperty(){
        System.out.println("Введите название свойства.");
        toScan1 = sc.nextLine();
        track.addNewProperty(toScan1);
    }

    private void addObject(){
        System.out.println("Введите имя объекта.");
        toScan1 = sc.nextLine();
        track.addObject(toScan1);
    }

    private void fillTheObject(){
        Property[] prop = new Property[track.properties.size()];
        for(int i = 0; i < track.properties.size(); i++){
            prop[i] = track.properties.get(i);
        }
        int number = -1;
        System.out.println("Введите номер объекта.");
        toScan1 = sc.nextLine();
        do{
            try{
                number = Integer.parseInt(toScan1);
            }catch (Exception E){
                System.out.println("Неправильный номер объекта. Введите еще раз.");
                Scanner sc = new Scanner(System.in);
                toScan1 = sc.nextLine();
            }
        }while(number == -1);

        for(int i = 0; i < track.properties.size(); i++){
            System.out.print("Вводи Свойство:"+prop[i].getName()+" |");
            toScan2 = sc.nextLine();
            prop[i].setValueOfObject(number, toScan2);
        }
        for(int i = 0; i < track.properties.size(); i++){
            track.properties.set(i,prop[i]);
        }

    }

    private void delObject(){
        System.out.println("Введите номер объекта.");
        toScan1 = sc.nextLine();
        track.delObject(toScan1);
    }

    private void remakeString(){
        System.out.println("Введите число символов в ячейке.");
        track.simbols = Integer.parseInt(sc.nextLine());//  remake
    }


}
