package ru.emil.Jurnal;

public class Subject {
    private static String Name;
    private static int i = 0;
    private static int[] marks = new int[100];
    private String da = "";

    public Subject() {
        System.out.println("Вы добавляете новый учебный предмет.\nВведите название предмета.");
        Name = Scan.user();
        System.out.println("Введите да для добавления оценок.");
        da = Scan.user();
        if (da.equals("да")) {
            System.out.println("Сколько оценок вы хотите ввести.");
            int x = Integer.parseInt(Scan.user());
            addMark(Scan.user());

        }
    }

    public static void addMark(String a) {
        int b = Integer.parseInt(a);
        marks[i] = b;
        i++;
        System.out.println("Успешно!");
    }

    public static String getMarks() {
        int s = i;
        String markz = "";

        while (s >= 0) {
            markz += marks[s];
            s--;
        }
        return markz;
    }

    public static void setSubject(String n) {
        Name = n;
        System.out.println("Успешно!");
    }
}