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

     public void addPropertyOfObject(String propertyName, String value, String ObjectzNumber){
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
             do {
                 try {
                     number = Integer.parseInt(ObjectzNumber);
                 } catch (Exception E) {
                     System.out.println("Неправильный номер объекта. Введите еще раз.");
                     Scanner sc = new Scanner(System.in);
                     ObjectzNumber = sc.nextLine();
                 }
             } while (number == -1);
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
             if (b){
                 c.setValueOfObject(number,value);
                 properties.add(i,c);
             }else{
                 System.out.println("Что-то пошло не так. Значение свойства не добавленно.");
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
       //  if(s.length()> 10){
        //     char[] ch = s.toCharArray();
        //     s = null;
        //     for(int i1 = 0; i1 < 10; i1++){
        //         s += ch[i1];
         //    }
         //}else{

         //   char[] ch = s.toCharArray();
         //   s = null;
          //  char[] ch1 = new char[10];
           // for (int per = 0; per < ch.length; per++ ){
            //    ch1[per] = ch[per];
           // }////
           // f////or (int per1 = ch.length; per1 < 10; per1++ ){
          // ////     ch1[per1] = ' ';
           // }
             //for(int i1 = 0; i1 < 10; i1++
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
                     System.out.println("|"+remakeString(simbols,pr[i].getName())+"|");//;+ "|");gjgchhvfgfhggvvbb
                 }else {
                     System.out.print(remakeString(simbols,pr[i].getName()) + "|");
                 }
             }

             for (int i = 0; i < objects.size(); i++) {
                 System.out.print("|" + ob[i].getName() + "|" );
                 for (int b = 0; i < pr.length; b++){
                     if(i == properties.size() - 1){
                         System.out.println(pr[i].getValue(b+1) + "|");
                     }else {
                         System.out.print(pr[i].getValue(b+1) +"|");
                     }
                 }
             }
         }else {
             System.out.println("Нет объектов.");
         }
     }

     private String remakeString(int a,String b) {
         char[] ch1 = b.toCharArray();
         char[] ch2 = new char[a];
         if (a>ch1.length)  {
             for(int i = 0; i< ch1.length; i++){
                 ch2[i]  = ch1[i];
             }
             for(int i = ch1.length; i < a; i++) {
                 ch2[i] = ' ';
             }
         }  else{
             for(int i = 0; i<a;i++)     {
                  ch2[i] = ch1[i];
         }
         for(int i = 0; i < a; i++){
             b+= ch2[i];
             }
         }
         return b;
     }

}

