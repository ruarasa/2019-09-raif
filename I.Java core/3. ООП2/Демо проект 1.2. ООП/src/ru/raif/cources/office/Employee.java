package ru.raif.cources.office;

public abstract class Employee implements ICanWork{
    protected String name;

    public abstract void report();

    @Override
    public void rest() {
        System.out.println();
    }

    public void endDay(){
        System.out.println("Go Home");
    }

}
