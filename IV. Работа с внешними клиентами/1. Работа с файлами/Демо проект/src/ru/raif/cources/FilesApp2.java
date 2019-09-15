package ru.raif.cources;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by a.pervushov on 21.11.2017.
 */
public class FilesApp2 {
    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("C://SomeDir//note.txt"))
        {
            System.out.println("Размер файла: " + fin.available() + " байт(а)");

            int i=-1;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
