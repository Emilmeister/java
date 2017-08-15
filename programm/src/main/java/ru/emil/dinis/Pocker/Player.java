package ru.emil.dinis.Pocker;

import java.util.Random;

/**
 * Create by dinis of 13.08.17.
 */
public class Player {

    private Card[] cards = new Card[2];

    private Card[] coloda;

    private int balance;

    private Random rn;

    public Player(int balance, Card[] coloda, Random rn) {
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
