package ru.raif.cources.set;

import java.util.Set;
import java.util.TreeSet;

public class Base {
    public static void main(String[] args) {

        //Putting Integers in sorted order
        Set integerSet = new TreeSet();
        integerSet.add(new Integer(17));
        integerSet.add(new Integer(1));
        integerSet.add(new Integer(4));
        integerSet.add(new Integer(9));

        System.out.println(integerSet.toString());
    }

}
