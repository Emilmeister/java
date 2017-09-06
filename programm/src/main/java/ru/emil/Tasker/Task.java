package ru.emil.Tasker;

public class Task {
    String name;
    int    rate;
    int    time; //in minutes

    public Task(String name, int rate, int time){
        this.name = name;
        this.rate = rate;
        this.time = time;
    }
}
