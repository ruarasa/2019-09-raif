package ru.raif.cources.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.raiffeisen.cources.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}
