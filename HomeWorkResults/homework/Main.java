package ru.raif.homework;

public class Main {

    public static void main (String[] args) {

        HotCold hotCold = new HotCold();
        if (hotCold.askUserIfStart()) {
            hotCold.game();
        }


    }

}
