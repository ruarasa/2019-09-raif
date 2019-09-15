package gen.restrict.exmpl;

public class StatsDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Stats<Integer> integerAverage = new Stats<Integer>(intArray);
        double v = integerAverage.average();
        System.out.println("Integer average is " + v);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> doubleAverage = new Stats<Double>(doubleArray);
        double w = doubleAverage.average();
        System.out.println("DoubleAverage is " + w);

        // Если раскоментировать - будет ошибка компиляции
        // так как String не является подклассом Number.
       /* String[] strs = {"1", "2", "3", "4", "5"};
        Average<String> strob = new Average<String>(strs);

        double x = strob.average();
        System.out.println("strob average is " + v);*/
    }
}
