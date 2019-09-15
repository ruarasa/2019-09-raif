package ru.raif.cources;

/**
 * Created by a.pervushov on 20.11.2017.
 */
public class ReturnCatch {
    public static void main(String[] args) {
        System.out.println("Start program");

        try {
            System.out.println("Start try");
            int a = 10 / 0;
        } catch (ArithmeticException are){
            System.out.println("Start are catch");
            are.printStackTrace();
            return;
        } catch (Exception e){
            System.out.println("Start E catch");
            e.printStackTrace();
            System.out.println("Start E catch");
        } finally {
            System.out.println("Start finally");
            System.out.println("End finally");
        }

        System.out.println("End program");
    }
}
