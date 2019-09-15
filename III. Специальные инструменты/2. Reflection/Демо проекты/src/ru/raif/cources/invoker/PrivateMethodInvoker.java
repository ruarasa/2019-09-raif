package ru.raif.cources.invoker;

import ru.raif.cources.getinfo.Child;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethodInvoker {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Child child = new Child();
        Class<?> clazz = child.getClass();
        Method method = clazz.getDeclaredMethod("getNumber");
        method.setAccessible(true);
        System.out.println(method.invoke(child));
    }
}
