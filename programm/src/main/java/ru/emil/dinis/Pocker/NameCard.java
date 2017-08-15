package ru.emil.dinis.Pocker;

/**
 * Create by dinis of 13.08.17.
 */
public class NameCard {

    public NameCard() {

    }

    public static String[] fillName() {
        String[] nameCards = new String[13];
        nameCards[0] = "Два";
        nameCards[1] = "Три";
        nameCards[2] = "Четыре";
        nameCards[3] = "Пять";
        nameCards[4] = "Шесть";
        nameCards[5] = "Семь";
        nameCards[6] = "Восемь";
        nameCards[7] = "Девять";
        nameCards[8] = "Десять";
        nameCards[9] = "Валет";
        nameCards[10] = "Дама";
        nameCards[11] = "Король";
        nameCards[12] = "Туз";
        return nameCards;
    }
}
