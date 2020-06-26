//NON STATIC NESTED CLASS
class Demo11 {
    int a = 10;
    class Demo22 {
        int a = 22;
        void meth1() {
            System.out.println("method1");
            System.out.println("a = " + a);
            System.out.println("a = " + Demo11.this.a);
        }
    }
}

public class nestedClass1 {
    public static void main(String[] args) {
        Demo11 obj = new Demo11();
        Demo11.Demo22 obj2 = obj.new Demo22();
        obj2.meth1();
    }
}
