package ru.dt.coldhot;

public class Starter {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Game game = new Game(engine);

        game.init();
        game.start();
        game.showResults();
    }
}
