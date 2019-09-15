package ru.raif.cources;

/**
 * Created by a.pervushov on 20.11.2017.
 */
public class Simple {
    public static void main(String[] args) {
        System.out.println("Start program");

        try {
            System.out.println("Start try");
            int a = 10 / 0;
        } catch (ArithmeticException are){
            System.out.println("Start are catch");
            are.printStackTrace();
            throw new NullPointerException();
        } catch (NullPointerException npe){
            System.out.println("Start NPE catch");
            npe.printStackTrace();
            System.out.println("End NPE catch");
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
