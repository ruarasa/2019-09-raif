package gen.common.exmpl.method.exmpl;

public class GenericMethodDemo {
    // Определить, совпадает ли содержимое двух массивов
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        // Массивы, имеющие разную длину, не могут быть одинаковыми
        if(x.length != y.length) return false;
        for(int i=0; i < x.length; i++)
            if ( !x[i].equals(y[i]))
                return false; // массивы отличаются
        return true; // содержимое массивов совпадает
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        Integer[] sameArr = {1, 2, 3, 4, 5};
        Integer[] intArrLong = {1, 2, 3, 4, 5, 6, 7, 8};

        if (arraysEqual(intArr, sameArr)){
            System.out.println("Массивы intArr и sameArr равны");
        }

        if (arraysEqual(intArr, intArrLong)){
            System.out.println("Массивы  intArr и intArrLong равны");
        }
    }
}
