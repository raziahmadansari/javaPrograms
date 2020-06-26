abstract class A11 {
    int x = 10;

    void demo() {
        System.out.println("demo function x = " + x);
    }
}

interface B1 {
    double x = 20.0;
    void demo();
}

public class test extends A11 implements B1 {
    public static void main(String[] args) {
        test obj = new test();
        obj.demo();

        A11 a11 = new A11() {
            void demo() {
                super.demo();
            }
        };

        a11.demo();
    }


    public void demo() {
        System.out.println("value of x = " + B1.x);
    }
}
