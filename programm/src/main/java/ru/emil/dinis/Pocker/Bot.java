package ru.emil.dinis.Pocker;

import javafx.scene.control.RadioMenuItem;

import java.util.Random;

/**
 * Create by dinis of 13.08.17.
 */
public class Bot {

    private Card[] cards = new Card[2];

    private Card[] coloda;

    private Random rn;

    private int balance;

    public Bot(int balance, Card[] coloda, Random rn) {
        this.balance = balance;
        this.coloda = coloda;
        this.rn = rn;
    }

    public Card[] getCards() {
        return cards;
    }

    public int getBalance() {
        return balance;
    }

    public void fillTwo() {
        for (int i = 0; i < 2;) {
            int tmp = rn.nextInt(52);
            Card c = this.coloda[tmp];
            if (c != null) {
                cards[i] = c;
                this.coloda[tmp] = null;
                i++;
            }
        }
    }
}
