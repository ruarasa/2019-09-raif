package ru.raif.cources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by a.pervushov on 21.11.2017.
 */
public class FilesApp4 {
    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("C://SomeDir//notes.txt");
            FileOutputStream fos=new FileOutputStream("C://SomeDir//notes_new.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
