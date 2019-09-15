package ru.raif.cources.getinfo;

public class Child extends Parent implements MyInterface{
    public Double salary;
    protected String info;
    private short number;

    public Child(String name, int age, boolean isSecret, Double salary, String info) {
        super(name, age, isSecret);
        this.salary = salary;
        this.info = info;
    }

    public Child() {
    }

    public Double getSalary() {
        return salary;
    }

    protected void setSalary(Double salary) {
        this.salary = salary;
    }

    private String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private short getNumber() {
        return number;
    }

    protected void setNumber(short number) {
        this.number = number;
    }

    @Override
    public void log() {

    }

    @Override
    public int getAge(int start) {
        return 0;
    }
}
