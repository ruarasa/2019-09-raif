package ru.raif.cources.start;

import java.util.List;

public class MySelf extends Human{
    private String name;
    private Integer age;
    private List<String> professions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public void setProfessions(List<String> professions) {
        this.professions = professions;
    }

    MySelf(){
     //creates by default
    }

    MySelf(int age){
        //override default constructor
        this.age = age;
    }

    public String talk(){
        return "blabla";
    }
}
