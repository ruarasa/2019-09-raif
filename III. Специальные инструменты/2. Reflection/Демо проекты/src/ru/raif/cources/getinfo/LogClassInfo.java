package ru.raif.cources.getinfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LogClassInfo {
    public static void main(String[] args) {
        Child child = new Child();

        logClassInfo(child.getClass());
    }

    private static void logClassInfo(Class<?> aClass) {
        for (Method method:
             aClass.getMethods()) {
            logMethodInfo(method);
        }
        for (Method method:
                aClass.getDeclaredMethods()) {
            logMethodInfo(method);
        }

        for (Field field:
                aClass.getFields()){
            logFieldInfo(field);
        }

        for (Field field:
                aClass.getDeclaredFields()){
            logFieldInfo(field);
        }

        if(aClass.getSuperclass() != null){
            logClassInfo(aClass.getSuperclass());
        }

        for (Annotation annotation:
                aClass.getAnnotations()){
            logAnnotation(annotation);
        }

        for (Class inter:
             aClass.getInterfaces()) {
            logClassInfo(inter);
        }
    }

    private static void logAnnotation(Annotation annotation) {
        System.out.println("annotation " + annotation.annotationType().getName());
    }

    private static void logFieldInfo(Field field) {
        System.out.print("Field ");
        System.out.print(field.getName());
        System.out.print(field.getType().getName());
        for (Annotation annotation:
             field.getAnnotations()) {
            logAnnotation(annotation);
        }
        System.out.println();
    }

    private static void logMethodInfo(Method method) {
        System.out.print(method.getReturnType().getName());
        System.out.print(method.getName());
        System.out.print(method.getModifiers());
        System.out.print(method.getParameterTypes());
        System.out.println();
    }
}
