package ru.dt.coldhot;

import java.util.Scanner;

import static java.lang.Math.abs;
import static ru.dt.coldhot.ComparisonResult.*;

public class Engine {
    private final int MAX_RANDOM_NUMBER;
    private final int MAX_NUMBER_OF_ATTEMPTS;
    private int randomNumber;
    private int userInput;
    private int previousAttempt = -1;
    private int numberOfAttempts = 0;
    private Scanner scanner = new Scanner(System.in);

    public Engine(int maxRandomNumber, int maxNumberOfAttempts) {
        this.MAX_RANDOM_NUMBER = maxRandomNumber;
        this.MAX_NUMBER_OF_ATTEMPTS = maxNumberOfAttempts;
    }

    public void init() {
        System.out.println("Я загадал число от 0 до " + MAX_RANDOM_NUMBER + ". Попробуй угадать!");
        randomNumber = (int) (Math.random() * MAX_RANDOM_NUMBER);
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
