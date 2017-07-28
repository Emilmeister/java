package ru.emil.Jurnal;

public class Start {

    private static int[] mass = new int[10];
    private static String number = "";

    public static void go() {


        System.out.println("Вы запустили программу Журнал. Для выхода напишите exit.\nДля добавления (выбора) нового ученика или  нажмите от 1 до 10 в зависимости какого номера ученика хотите добавить (выбравть). Макс учеников 10.");
        number = Scan.user();

        while (!(number.equals("exit"))) {

            if (number.equals("1")) {

                if (mass[0] == 0) {
                    Student student1 = new Student();
                    mass[0]++;
                }


                System.out.println("Введите добавить для добавления оценки и оценки для их вывода.");
            }

            System.out.println("Для выхода напишите exit.");
            number = Scan.user();
        }
    }

}
