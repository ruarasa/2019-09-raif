package ru.raif.cources.soap.generated;

import ru.raiffeisen.cources.soap.HelloWorld;

public class Client {
    public static void main(String[] args) {

        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();

        System.out.println(hello.getHelloWorldAsString("uuykuy"));

    }
}
