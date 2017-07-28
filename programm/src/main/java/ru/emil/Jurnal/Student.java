package ru.emil.Jurnal;

public class Student {

    private static String knso;
    private int[] mass = new int[10];
    private String sub = "";

    //private static String klass;
    //private static String name;
    //private static String surname;
    //private static String otchestvo;

    public Student() {
        System.out.println("Иванов Иван Иванович 1 класс.\nДля изменения Фио и класса наберите new.");
        knso = "1 класс Иванов Иван Иванович";
        String a = Scan.user();
        if (a.equals("new")) {
            System.out.println("Введите номер каласса и фио.");
            knso = Scan.user();
        }
        System.out.println("Введите да для добавленния предмета.");
        sub = Scan.user();
        if (sub.equals("да")) {
            if (mass[0] == 0) {
                Subject subject1 = new Subject();
            }
        }
        System.out.println("Ученик установлен.");
    }

    static void setStudent(String k) {
        knso = k;
        //klass = k;
        //name = n;
        //surname = s;
        //otchestvo = o;
        System.out.println("Успешно!");
    }
}
