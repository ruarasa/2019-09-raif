package ru.raif.cources;

/**
 * Created by a.pervushov on 21.11.2017.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FilesApp8 {

    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat")))
        {
            Person p = new Person("Джон", 33, 178, true);
            oos.writeObject(p);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

    static class Person implements Serializable {

        public String name;
        public int age;
        public double height;
        public boolean married;

        Person(String n, int a, double h, boolean m){

            name=n;
            age=a;
            height=h;
            married=m;
        }
    }
}


