abstract class A1{
    int a = 10;
    abstract int add(int a, int b);
}

interface X {
    int a = 20;
    void test();
    void demo();
    static void show(){
        System.out.println("show");
    }
}

interface Y {
    int a = 30;
    void test();
    default void demo(){
        System.out.println("demo");
    }
}

public class abstractClass extends A1 implements X,Y {
    public static void main(String[] args) {

    }

    @Override
    int add(int a, int b) {
        System.out.println("add :: " + (a + b));
        return 0;
    }

    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void demo() {
        System.out.println("demo class :: " );
    }
}
