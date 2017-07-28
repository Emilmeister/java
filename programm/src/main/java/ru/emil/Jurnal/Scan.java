package ru.emil.Jurnal;
/*
This class have a method which returns users input(string).
 */

import java.util.Scanner;

public class Scan {

    public static String user() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;
    }

}
