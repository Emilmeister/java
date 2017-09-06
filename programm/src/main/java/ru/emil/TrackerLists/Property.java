package ru.emil.TrackerLists;

import java.util.ArrayList;

public class Property {


    private String  name;
    private String[] value = new String[100];

    public Property(String name){ //constructor
        this.name = name;

    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue(int numberOfOfject) {
        numberOfOfject -=1;
        return value[numberOfOfject];
    }

    public void setValueOfObject(int numberOfObject, String value) {
        numberOfObject -= 1;
        this.value[numberOfObject] = value;


    }

}
