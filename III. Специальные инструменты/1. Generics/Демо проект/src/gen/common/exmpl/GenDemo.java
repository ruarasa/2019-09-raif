package gen.common.exmpl;

public class GenDemo {
    public static void main(String args[]) {
        // Создать ссылку на объект типа Gen<Integer>
        Gen<Integer> iOb;

        // Создать объект типа Gen<Integer> и присвоить ссылку на
        // него переменной iOb. Обратите внимание на автоупаковку при
        // инкапсуляции значения 88 в объекте типа Integer.

        iOb = new Gen<Integer>(88); //Соpдание экэемпnяра типа Gen<Integer>
        // Отобразить тип данных, используемых в объекте iOb
        iOb.showType();

        // Получить значения из объекта iOb. Обратите внимание
        //на то, что приведение типов здесь не требуется.
        int v = iOb.getob();
        System.out.println("знaчeниe: " + v);
        System.out.println();

        // Создать объект типа Gen для строк
        Gen<String> strOb = new Gen<String>("Tecтиpoвaниe");

        // Отобразить тип данных, используемых в объекте strOb
        strOb.showType();

        // Получить значение из объекта strOb.
        // Заметьте, что приведение типов эдесь также не требуется.
        String str = strOb.getob();
        System.out.println("знaчeниe: " + str);
    }
}
