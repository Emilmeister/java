package ru.emil.TrackerLists;

import java.util.Scanner;

public class Go {
    String toScan1 = "";
    String toScan2 = "";
    String toScan3 = "";

    Tracker track = new Tracker();

    Scanner sc = new Scanner(System.in);
    public void init(){
        toScan1 = sc.nextLine();
        track.addObject(toScan1);
        toScan1 = sc.nextLine();
        track.addObject(toScan1);
        toScan1 = sc.nextLine();
        track.addNewProperty(toScan1);
        toScan1 = sc.nextLine();
        toScan2 = sc.nextLine();
        toScan3 = sc.nextLine();
        track.addPropertyOfObject(toScan1, toScan2, toScan3);
        track.getObjectsAndPropertys();

    }
}
