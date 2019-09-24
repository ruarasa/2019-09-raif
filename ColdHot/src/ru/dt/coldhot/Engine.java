package ru.dt.coldhot;

import java.util.Scanner;

import static java.lang.Math.abs;
import static ru.dt.coldhot.Engine.ComparisonResult.*;

public class Engine {
    private static final int MAX_NUMBER = 100;
    private static final int MAX_NUMBER_OF_ATTEMPTS = 10;
    private int randomNumber;
    private int userInput;
    private int previousAttempt = -1;
    private int numberOfAttempts = 0;
    private Scanner scanner = new Scanner(System.in);


    public void init() {
        System.out.println("Я загадал число. Попробуй угадать!");
        randomNumber = (int) (Math.random() * MAX_NUMBER);
    }

    public void runGame() {
        System.out.println(randomNumber);
        while (!isSuccess() && !exceededNumberOfAttempts()) {
            System.out.println("Осталось " + (MAX_NUMBER_OF_ATTEMPTS - numberOfAttempts) + " попыток!");
            userInput = getNumberFromUser();
            ComparisonResult compared = compareStoredNumberWithUserInput();

            if (!isFirstAttempt() || isSuccess()) {
                showAttemptResult(compared);
            } else {
                System.out.println("Не угадал!");
            }

            numberOfAttempts++;
            previousAttempt = userInput;
        }
    }

    private boolean exceededNumberOfAttempts() {
        return numberOfAttempts >= MAX_NUMBER_OF_ATTEMPTS;
    }

    private boolean isFirstAttempt() {
        return previousAttempt == -1;
    }

    private void showAttemptResult(ComparisonResult comparisonResult) {
        System.out.println(comparisonResult.getText());
    }

    private boolean isSuccess() {
        return userInput == randomNumber;
    }

    private ComparisonResult compareStoredNumberWithUserInput() {
        if (isSuccess()) {
            return EQUAL;
        } else if (distance() < previousDistance()) {
            if (distance() < 3) {
                return FIRE;
            }
            return CLOSER;
        } else if (distance() == previousDistance()) {
            return SAME;
        } else {
            return FAR_AWAY;
        }
    }

    enum ComparisonResult {
        CLOSER("теплее"),
        EQUAL("Успех!"),
        FAR_AWAY("холодно"),
        SAME("Так же"),
        FIRE("Огонь-огонь!!");

        private String text;

        ComparisonResult(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    ;

    private int previousDistance() {
        return abs(randomNumber - previousAttempt);
    }

    private int distance() {
        return abs(randomNumber - userInput);
    }

    private int getNumberFromUser() {
        return scanner.nextInt();
    }

    public String getResults() {
        return !isSuccess() && exceededNumberOfAttempts()
                ? "Ты проиграл! Ха-ха-ха!!"
                : "На этот раз ты победил. Кол-во попыток " + numberOfAttempts + " из " + MAX_NUMBER_OF_ATTEMPTS;
    }
}
