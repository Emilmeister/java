package ru.emil.MassiveJurnal;

public class Start {
    static void start() {
        Go.clearGeneralMassive();
        System.out.println("Вы запустили Школьный журнал.\nВыход exit. \nПродолжение энтер.");
        String a = Scan.in();
        while (!a.equals("exit")) {
            System.out.println("Введите\n[1]\tДля добавления нового ученика.\n[2]\tДля добавления нового предмета для всех учеников.\n[3]\tДля установления оценок.\n[4]\tДля запроса оценок.");
            a = Scan.in();
            if (a.equals("1")) {
                Go.newStudent();
            }
            if (a.equals("2")) {
                Go.newSubjects();
            }
            if (a.equals("3")) {
                Go.setMarks();
            }
            if (a.equals("4")) {
                Go.getMarks();
            }
            System.out.println("\nВыход exit. \n Продолжение энтер.");
            a = Scan.in();
        }
    }
}
