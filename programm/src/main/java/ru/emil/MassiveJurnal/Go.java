package ru.emil.MassiveJurnal;


public class Go {

    private static String[][][] generalMassive = new String[10][15][30];
    private static int[] Student = {0, 1, 1};    //{{0};{1};{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30}
    private static int[][] marks = new int[10][15];

    static public void clearGeneralMassive() {
        for (int i = 0; i < 10; i++) {
            for (int b = 0; b < 15; b++) {
                for (int c = 0; c < 30; c++) {
                    generalMassive[i][b][c] = "";
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int c = 1; c < 15; c++) {
                marks[i][c] = 1;
            }
        }
    }

    static public void newStudent() { // Вбивает в массив имя ученика.
        System.out.println("Введите Фио и класс нового ученика.");
        generalMassive[Student[0]][0][0] = Scan.in();
        Student[0]++;
        System.out.println("Успешно.");
    }

    static public void newSubjects() {
        System.out.println("Введите учебный предмет.");
        String a = Scan.in();
        for (int i = 0; i < 10; i++) {
            generalMassive[i][Student[1]][0] = a;

        }
        Student[1]++;
    }


    // static void sout() {
    // for (int i = 0; i < 10; i++) {
    //     System.out.print(generalMassive[i][0][0] + "  ");
    //      System.out.println(generalMassive[i][1][0]);
    //    }
    // }

    public static void setMarks() {
        System.out.println("Введите сначала Фио и класс ученика для добавления оценки(ок), нажмите энтер и введите название учебного прредмета.");
        String a = Scan.in();
        String b = Scan.in();
        for (int i = 0; i < 10; i++) {
            if (a.equals(generalMassive[i][0][0]) && (!a.equals(""))) {
                for (int c = 1; c < 15; c++) {
                    if (b.equals(generalMassive[i][c][0]) && (!b.equals(""))) {
                        System.out.println("Введите отметки");
                        generalMassive[i][c][marks[i][c]] = Scan.in();
                        marks[i][c]++;
                    }
                }
            }
        }
        System.out.println("Либо вы ввели оценки, либо ошибка. ");
    }

    public static void getMarks() {
        for (int i = 0; i < 10; i++) {
            if (generalMassive[i][0][0] != "") {
                System.out.println("\n" + generalMassive[i][0][0] + "\n\t\t");

                for (int b = 1; b < 15; b++) {
                    if (!(generalMassive[i][b][0] == "")) {
                        System.out.print("\n" + generalMassive[i][b][0] + "\n");
                    }
                    for (int c = 1; c < 30; c++) {
                        if (generalMassive[i][b][c] != "") {
                            System.out.print(generalMassive[i][b][c]);
                        }
                    }

                }
            }
        }
    }
}


