package ru.raif.cources.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SimpleExample2 {
    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter("Output.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson("Hello", writer);
            gson.toJson(123, writer);
        }
    }
}
