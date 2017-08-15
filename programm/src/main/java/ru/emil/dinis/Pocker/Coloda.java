package ru.emil.dinis.Pocker;

import com.sun.deploy.util.ArrayUtil;

/**
 * Create by dinis of 13.08.17.
 */
public class Coloda {

    private Card[] cards = new Card[52];

    public Coloda() {

    }

    public Card[] fillColoda() {
        Mast chervi = new Mast("Черви");
        Mast picki = new Mast("Пики");
        Mast bubi = new Mast("Буби");
        Mast kresti = new Mast("Крести");

        Card[] ch = chervi.fillCards();
        Card[] pic = picki.fillCards();
        Card[] bub = bubi.fillCards();
        Card[] kres = kresti.fillCards();

        System.arraycopy(ch, 0, this.cards, 0, ch.length);
        System.arraycopy(pic, 0 , this.cards, 13, pic.length);
        System.arraycopy(bub, 0, this.cards, 26, bub.length);
        System.arraycopy(kres, 0, this.cards, 39, kres.length);

        return this.cards;
    }
}
