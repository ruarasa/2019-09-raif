package ru.raif.cources.structure;

public class VisionScope {
    final static String txt = "Это глобальная переменная класса Scope";
    final String txtClass= "Это классовая переменная класса Scope";

    public static void main(String[] args) {
        String txt = "Это локальная переменная метода main";
        System.out.println(txt);
        sub();
        System.out.println(VisionScope.txt);
    }

    public static void sub() {
        // String txt = "Это локальная переменная метода sub";
        VisionScope visionScope = new VisionScope();
        System.out.println(visionScope.txtClass);
        System.out.println(txt);
    }
}
