package ru.raif.cources;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by a.pervushov on 21.11.2017.
 */
public class FilesApp3 {
    public static void main(String[] args) {

        String text = "Hello world!"; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("C://SomeDir//notes.txt"))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
