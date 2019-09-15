package ru.raif.cources;

public class SbExample {
    public static void main(String a[]){
        StringBuilder sb1 = new
                StringBuilder("Welcome to Geeksforgeeks ");
        System.out.println("Input: " + sb1);

        // Appending the boolean value
        sb1.append(true);
        System.out.println("Output: " + sb1);

        System.out.println();

        StringBuilder sb2 = new StringBuilder("We fail- ");
        System.out.println("Input: " + sb2);

        // Appending the boolean value
        sb2.append(false);
        System.out.println("Output: " + sb2);
    }
}
