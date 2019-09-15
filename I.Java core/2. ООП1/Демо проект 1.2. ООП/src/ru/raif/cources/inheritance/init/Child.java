package ru.raif.cources.inheritance.init;


public class Child extends Parent {
    public Child() {
        message = "a";
    }

    @Override
    void method() {
        if(message.equals("a"))
            System.out.println("Method");
    }
}
