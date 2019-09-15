package ru.raif.cources;

/**
 * Created by a.pervushov on 21.11.2017.
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FilesApp9 {

    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
        {
            Person p=(Person)ois.readObject();
            System.out.printf("Имя: %s \t Возраст: %d \n", p.name, p.age);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }
}

