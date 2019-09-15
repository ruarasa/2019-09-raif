package gen.common.exmpl;

public class GenChild<T> extends Gen<T> {
    GenChild(T o){
        super(o);
    }

    public static void main(String[] args) {
         Gen<String> test = new GenChild<String>("Test str");
         test.showType();
    }
}
