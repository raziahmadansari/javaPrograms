class Demo01{
    void demo(Demo01 obj) {
        class X {
            void show() {
                System.out.println("inside of class");
            }
        }
        new X().show();
    }
    void demo() {
        System.out.println("inside Demo01 obj");
        demo(this);
    }
}

public class overloadedFunctionLocalClass {
    public static void main(String[] args) {
        Demo01 obj = new Demo01();
        obj.demo();
    }
}
