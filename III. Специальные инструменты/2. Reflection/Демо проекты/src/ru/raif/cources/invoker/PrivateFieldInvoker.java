package ru.raif.cources.invoker;

import ru.raif.cources.getinfo.Child;

import java.lang.reflect.Field;

public class PrivateFieldInvoker {
    public static void main(String[] args) {
        Child myClass = new Child();

        int number = 0; //no getter =(
        System.out.println(number);//output 0null
        try {
            Field field = myClass.getClass().getDeclaredField("number");
            field.setAccessible(true);
            number = (int) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(number);//output 0default
    }
}
