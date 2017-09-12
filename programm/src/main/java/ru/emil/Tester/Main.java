package ru.emil.Tester;

public class Main {
    public static void main(String[] args) {
        String a = "aaa";

        a = remakeString(5,a);
        char[] chars = a.toCharArray();
        System.out.println(chars.length);
        System.out.println(a);

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
