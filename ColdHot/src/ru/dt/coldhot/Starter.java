package ru.dt.coldhot;

public class Starter {
    public static void main(String[] args) {
        Engine engine = new Engine(5, 2);
        Game game = new Game(engine);

        game.init();
        game.start();
        game.showResults();
    }
}
