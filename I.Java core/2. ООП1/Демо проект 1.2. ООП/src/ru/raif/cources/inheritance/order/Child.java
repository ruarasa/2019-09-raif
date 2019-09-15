package ru.raif.cources.inheritance.order;

public class Child extends Parent {
    static int d = 0;
    static {
        System.out.println("Start static Child");
        d++;
        System.out.println("d= " + d);
        d++;
        System.out.println("Start static Child");
    }
    int e = 0;
    int f;
    {
        System.out.println("Start block Child");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);
        System.out.println("e= " + e);
        System.out.println("f= " + f);
        System.out.println("End block Child");
    }
    Child(){
        System.out.println("Start constructor Child");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);
        System.out.println("e= " + e);
        System.out.println("f= " + f);
        System.out.println("End constructor Child");
    }
}
