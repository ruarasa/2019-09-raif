package ru.raif.homework;


import java.util.Scanner;

class HotCold {

    private int randomNumber = (int) (Math.random() * 100);
    private Scanner sc = new Scanner(System.in);

    boolean askUserIfStart() {
        System.out.println("Игра \"Горячо-Холодно\".\n Правила:\n" +
                "Программа сохраняет случайное число от 0 до 100.\n" +
                "Если введенное число ближе к сохранненому-программа пишет \"горячо\".\n" +
                "Если введенное число дальше от сохранненого-" +
                "программа пишет \"холодно\".\n" +
                "Когда введено число равное сохранненому - программа пишет \"успех\" и останавливается.");
        System.out.println("Если готовы начать игруть, введите \"Да\"");
        String s = sc.nextLine();
        if (s.equals("Да")) {
            String str = sc.nextLine();
            System.out.println("Начинаем!");
        } else {
            System.out.println(":(");
            return false;
        }
        return true;
    }

    void game() {
       // System.out.println(randomNumber);
        Integer previousEnteredNumber = null;

        while (true) {
            System.out.println("Введите целое число:");
            int userInput = sc.nextInt();
             if (previousEnteredNumber == null) {
              previousEnteredNumber = userInput;
               continue;
             }
            if (randomNumber == userInput) {
                System.out.println("Успех");
                break;
             }
            if (Math.abs(randomNumber - previousEnteredNumber) > Math.abs(randomNumber - userInput)) {
                System.out.println("Горячо");
             }
            else if (Math.abs(randomNumber - previousEnteredNumber) < Math.abs(randomNumber - userInput)) {
                System.out.println("Холодно");
             }
            previousEnteredNumber = userInput;


        }
    }
}




