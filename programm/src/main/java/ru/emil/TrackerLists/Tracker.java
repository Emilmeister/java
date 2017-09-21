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

     public void setPropertyOfObjectPrpName(String propertyName, String value, String ObjectzNumber){

         int number = -1;
         int numOfProp = 0;
         Property prop = new Property("");

         if(objects.isEmpty()){
             System.out.println("Нет ни одного свойства.");
         }else if (propertyName.equals("")){
             System.out.println("Не введено имя свойства.");
         }else if(value.equals("")){
             System.out.println("Вы не ввели значение.");
         }else if(ObjectzNumber.equals("")){
             System.out.println("Вы не ввели число.");
         }else {
             do{
                try{
                    number = Integer.parseInt(ObjectzNumber);
                }catch (Exception E){
                    System.out.println("Неправильный номер объекта. Введите еще раз.");
                    Scanner sc = new Scanner(System.in);
                    ObjectzNumber = sc.nextLine();
                }
             }while(number == -1);

             do{
                 for(int i = 0; i < properties.size(); i++){
                     if(properties.get(i).getName().equals(propertyName)){
                         prop = properties.get(i);
                         numOfProp = i;
                         break;
                     }
                 }
                 if(prop.getName().equals("")){
                     Scanner sc = new Scanner(System.in);
                     System.out.println("Не найдено свойство. Ведите другое.");
                     propertyName = sc.nextLine();
                 }
             }while(prop.getName().equals(""));
             prop.setValueOfObject(number,value);
             properties.set(numOfProp,prop);
         }
     }

     public String getPropertyOfObject(String ObjectzNumber, String nameOfProperty){
         Property b =  new Property("");
         int number = -1;
         String s = "";
         Object a = new Object("-1");
         do{
             try{
                 number = Integer.parseInt(ObjectzNumber);
             }catch (Exception E){
                 System.out.println("Неправильный номер объекта. Введите еще раз.");
                 Scanner sc = new Scanner(System.in);
                 ObjectzNumber = sc.nextLine();
             }
         }while(number == -1);

         if((objects.size() > 0)&&(properties.size() > 0)) {
             a = objects.get(number);
             int pr;
             for(pr = 0; pr< properties.size(); pr++){
                 b = properties.get(pr);
                 if(b.getName().equals(nameOfProperty)){
                     break;
                 }
             }
             if(a.getName().equals(a.getName())&&(b.getName().equals(nameOfProperty))) {

                 s = b.getValue(number+1);
             }else{
                 s ="";
             }
         }else {
             s = "";
         }
             return s;
     }//get one prop

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
             System.out.print("|    |"+remakeString(simbols,"")+"|");
             for (int i = 0; i < properties.size();i++ ){
                 if(i == properties.size() - 1) {
                     System.out.println(remakeString(simbols,pr[i].getName())+"|");
                 }else {
                     System.out.print(remakeString(simbols,pr[i].getName()) + "|");
                 }
             }

             for (int i = 0; i < objects.size(); i++) {
                 System.out.print("|"+ (remakeString(4, String.valueOf((i+1))) +"|" + remakeString(simbols, ob[i].getName()) + "|" ));
                 //for(int x = 0; x < ) {
                     for (int b = 0; b < properties.size(); b++) {
                         if (b == properties.size() - 1) {
                             System.out.println(remakeString(simbols, pr[b].getValue(i + 1)) + "|");//i -b
                         } else {
                             System.out.print(remakeString(simbols, pr[b].getValue(i + 1)) + "|");//i - b
                         }
                     }
                 //}
             }
         }else {
             System.out.println("Нет объектов.");
         }
     }//all

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

     public void remakeNameofObject(String ObjectzNumber, String nameOfObject){
         Object ob = new Object("");
         int ObNum = -1;
         try{
             ObNum = Integer.parseInt(ObjectzNumber);
         }catch (Exception E){
            System.out.println("Неправильно введен номер объекта.");
             Scanner sc = new Scanner(System.in);
             ObjectzNumber = sc.nextLine();

             ObNum = Integer.parseInt(ObjectzNumber);
         }
         if(!((ObNum < 0)||(objects.size()< ObNum))){
             ob = objects.get(ObNum-1);
             ob.setName(nameOfObject);
             objects.set(ObNum - 1, ob);
             System.out.print("Имя изменено.");
         }else{
             System.out.print("Имя не изменено.");
         }



     }
}

