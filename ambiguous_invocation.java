//ambiguous invocation
/*
class Demo{

    void method1(double a, int b){
        System.out.println("byte");
    }

    void method1(int a, double b){
        System.out.println("integer");
    }
}



public class ambiguous_invocation {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        byte a = (byte) 10;
        byte b = (byte) 10;
        d1.method1(10, 10);
    }
}
*/