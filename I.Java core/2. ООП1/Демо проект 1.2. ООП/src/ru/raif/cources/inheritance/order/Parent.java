package ru.raif.cources.inheritance.order;

public class Parent {
    static int a = 0;
    static {
        System.out.println("Start static Parent");
        a++;
        System.out.println("a= " + a);
        a++;
        System.out.println("End static Parent");
    }
    int b = 0;
    int c;
    {
        System.out.println("Start block Parent");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("End block Parent");
    }
    Parent(){
        System.out.println("Start constructor Parent");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("End constructor Parent");
    }
}
