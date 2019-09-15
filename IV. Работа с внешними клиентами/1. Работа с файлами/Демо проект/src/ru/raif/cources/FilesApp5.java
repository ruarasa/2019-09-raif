package ru.raif.cources;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

/**
 * Created by a.pervushov on 21.11.2017.
 */
public class FilesApp5 {
    public static void main(String[] args) {

        String text = "Hello world!";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try(BufferedInputStream bis = new BufferedInputStream(in)){

            int c;
            while((c=bis.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }
        System.out.println();
    }

}
