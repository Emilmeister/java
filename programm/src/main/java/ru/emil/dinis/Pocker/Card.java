package ru.emil.dinis.Pocker;

/**
 * Create by dinis of 13.08.17.
 */
public class Card {

    private String name;

    private String mast;

    private int cost;

    public Card(String name, String mast, int cost) {
        this.name = name;
        this.mast = mast;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getMast() {
        return mast;
    }

    public int getCost() {
        return cost;
    }
}
