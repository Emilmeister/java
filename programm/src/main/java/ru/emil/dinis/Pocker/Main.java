package ru.emil.dinis.Pocker;

/**
 * Create by dinis of 13.08.17.
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.razdat();
        game.showArray(game.getStols());

        game.showArray(game.getBot1().getCards());
        game.showArray(game.getBot2().getCards());
        game.showArray(game.getPlayer().getCards());
    }
}
