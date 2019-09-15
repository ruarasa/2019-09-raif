public class MultiDefErr<T, V> {
    T ob1;
    V ob2;

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }


    public static void main(String[] args) {
        MultiDefErr<String, String> tst = new MultiDefErr<String, String>();
    }
}
