package ru.emil.dinis.Pocker;

import java.util.Random;

/**
 * Create by dinis of 13.08.17.
 */
public class Game {

    private Card[] coloda = new Coloda().fillColoda();

    private Card[] stols = new Card[5];

    private Random rn = new Random();

    private Bot bot1 = new Bot(1000, this.coloda, this.rn);

    private Bot bot2 = new Bot(1000, this.coloda, this.rn);

    private Player player = new Player(1000, this.coloda, this.rn);

    public Card[] getColoda() {
        return coloda;
    }

    public Bot getBot1() {
        return bot1;
    }

    public Bot getBot2() {
        return bot2;
    }

    public Player getPlayer() {
        return player;
    }

    public void showArray(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card.getName() + "  " + card.getMast() + "  " + card.getCost());
        }
        System.out.println();
    }

    public Card[] getStols() {
        return this.stols;
    }

    public void razdat() {
        this.bot1.fillTwo();
        this.bot2.fillTwo();
        this.player.fillTwo();
        this.stol();
    }

    public void stol() {
        for (int i = 0; i < 5;) {
            int tmp = rn.nextInt(52);
            Card c = this.coloda[tmp];
            if (c != null) {
                stols[i] = c;
                this.coloda[tmp] = null;
                i++;
            }
        }
    }

}
