package ru.dt.coldhot;

public class Game {
    private Engine engine;

    public Game(Engine engine) {
        this.engine = engine;
    }

    void init() {
        engine.init();
    }

    void start() {
        engine.runGame();
    }

    void showResults() {
        System.out.println(engine.getResults());
    }
}
