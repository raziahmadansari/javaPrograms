//STATIC NESTED CLASS
class Demo12 {
    int a = 10;
    static class Demo23 {
        void meth1() {
            System.out.println("method1");
            //System.out.println("a = " + a);
        }
    }
}

public class nestedClass2 {
    public static void main(String[] args) {
        //Demo11 obj = new Demo11();
        Demo12.Demo23 obj2 = new Demo12.Demo23();
        obj2.meth1();
    }
}
