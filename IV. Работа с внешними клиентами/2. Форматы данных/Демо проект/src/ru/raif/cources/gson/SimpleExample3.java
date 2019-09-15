package ru.raif.cources.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class SimpleExample3 {
    public static void main(String[] args) throws IOException {
        try(Writer writer = new OutputStreamWriter(new FileOutputStream("Output.json") , "UTF-8")){
            Gson gson = new GsonBuilder().create();
            gson.toJson("Hello", writer);
            gson.toJson(123, writer);
        }
    }
}
