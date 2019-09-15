package ru.raif.cources.gson;

public class Person {
    private String NAME;
    private String LOCATION;

    @Override
    public String toString() {
        return NAME + " - " + LOCATION;
    }
}
