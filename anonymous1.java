//ANONYMOUS CLASS CAN NEVER BE ABSTRACT

abstract class anonymous {
    abstract void meth1();
}

public class anonymous1 {
    public static void main(String[] args) {
        //1ST ANONYMOUS CLASS
        anonymous obj = new anonymous() {
            @Override
            void meth1() {
                System.out.println("Anonymous...");
            }
        };
        obj.meth1();


        //2ND ANONYMOUS CLASS
        anonymous obj2 = new anonymous() {
            @Override
            void meth1() {
                System.out.println("Anonymous 2...");
            }
        };
        obj2.meth1();
    }
}
