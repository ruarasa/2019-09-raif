package gen.common.exmpl;

public class StaticTest{
    public static String msg = "new messgae";

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        System.out.println(test.msg);

        test = null;
        System.out.println(test.msg);
    }
}
