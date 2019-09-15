package ru.raif.cources.structure;

public class MethodCall {

    public static void main(String[] args) {
        Integer iOb  = 10;
        method(iOb);
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(Integer iOb) { //Будет вызван данный метод
        System.out.println("Integer");
    }
}
