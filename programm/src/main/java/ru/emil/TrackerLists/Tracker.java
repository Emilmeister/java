package ru.emil.TrackerLists;


import java.util.Scanner;
import java.util.ArrayList;

public class Tracker {
    ArrayList<Object> objects = new ArrayList();
    ArrayList<Property> properties = new ArrayList();
    public int simbols = 10;

     public void addObject(String name){
         if (name.equals("")){
             System.out.println("Вы не ввели имя.");
         } else {
             objects.add(new Object(name));
         }
     }

     public void addNewProperty(String name){
         if (name.equals("")){
             System.out.println("Вы не ввели имя.");
         } else {
             properties.add(new Property(name));
         }
     }

     public void setPropertyOfObject(String propertyName, String value, String ObjectzNumber){
         Property c = new Property("");
         Boolean b;
         int number = -1;

         if(objects.isEmpty()){
             System.out.println("Нет ни одного свойства.");
         }else if (propertyName.equals("")){
             System.out.println("Не введено имя свойства.");
         }else if(value.equals("")){
             System.out.println("Вы не ввели значение.");
         }else if(ObjectzNumber.equals("")){
             System.out.println("Вы не ввели число.");
         }else {
                 try {
                     number = Integer.parseInt(ObjectzNumber);
                 } catch (Exception E) {
                     System.out.println("Неправильный номер объекта. Введите еще раз.");
                     Scanner sc = new Scanner(System.in);
                     ObjectzNumber = sc.nextLine();
                 }
                 int i = 0;
                 do {
                     b = true;
                     Property a = properties.get(i);
                     if(a.getName().equals(propertyName)){
                         c = a;
                         break;
                     }
                     i++;
                        b = false;
                 }while (i < properties.size());
                 if(b){
                 c.setValueOfObject(number,value);
                 }
         }

     }

     public String getPropertyOfObject(String nameOfObject, String nameOfProperty){
         Property b =  new Property("");
         String s = "";
         Object a = new Object("-1");
         int i ;
         if((objects.size() > 0)&&(properties.size() > 0)) {
             for (i = 0; i < objects.size(); i++) {
                 a = objects.get(i);
                 if(a.getName().equals(nameOfObject)){

                     break;
                 }
             }
             int pr;
             for(pr = 0; pr< properties.size(); pr++){
                 b = properties.get(pr);
                 if(b.getName().equals(nameOfProperty)){
                     break;
                 }
             }
             if(a.getName().equals(nameOfObject)&&(b.getName().equals(nameOfProperty))) {

                 s = b.getValue(i+1);
             }else{
                 s ="";
             }
         }else {
             s = "";
         }
             return s;
     }

     public void getObjectsAndPropertys(){
         Object[] ob = new Object[objects.size()];
         Property[] pr = new Property[properties.size()];

         for(int i = 0; i < properties.size(); i++){
             pr[i] = properties.get(i);
         }
         for (int i = 0; i < objects.size(); i++){
             ob[i] = objects.get(i);
         }
         if(objects.size()>0){
             System.out.print("|          |");
             for (int i = 0; i < properties.size();i++ ){
                 if(i == properties.size() - 1) {
                     System.out.println(remakeString(simbols,pr[i].getName())+"|");
                 }else {
                     System.out.print(remakeString(simbols,pr[i].getName()) + "|");
                 }
             }

             for (int i = 0; i < objects.size(); i++) {
                 System.out.print("|" + remakeString(simbols, ob[i].getName()) + "|" );
                 for (int b = 0; b < properties.size(); b++){
                     if(b == properties.size() - 1){
                         System.out.println(remakeString(simbols,pr[i].getValue(b+1)) + "|");
                     }else {
                         System.out.print(remakeString(simbols,pr[i].getValue(b+1)) +"|");
                     }
                 }
             }
         }else {
             System.out.println("Нет объектов.");
         }
     }

    public static String remakeString(int a,String b) {
        char[] ch1 = b.toCharArray();
        char[] ch2 = new char[a];
        b = "";
        String str="";
        for(int i = ch1.length; i < a; i++) {
            ch2[i] = ' ';
        }
        if (a > ch1.length)  {
            for(int i = 0; i < ch1.length; i++){
                ch2[i] = ch1[i];
            }

            for(int i = 0; i < a; i++){
                str = String.valueOf(ch2[i]);
                b = b + str;
            }
        }  else{
            for(int i = 0; i < a;i++)     {
                ch2[i] = ch1[i];
            }
            for(int i = 0; i < a; i++){
                str = String.valueOf(ch2[i]);
                b = b + str;
            }
        }

        return b;
    }

}

