package ru.emil.dinis.Pocker;

/**
 * Create by dinis of 13.08.17.
 */
public class Mast {

    private String mastName;
    private Card[] cards = new Card[13];

    public Mast(String mastName) {
        this.mastName = mastName;
    }

    public Card[] fillCards() {
        String[] nameCards = NameCard.fillName();
        for (int i = 0; i < 13; i++) {
            Card card = new Card(nameCards[i], mastName, i + 1);
            this.cards[i] = card;
        }
        return this.cards;
    }
}
