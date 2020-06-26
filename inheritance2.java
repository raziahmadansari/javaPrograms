class C {
    C(int a) {
        System.out.println("constructor of A");
    }
}

class D extends C {
    D() {
        super(10);
        System.out.println("constructor of B");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        B obj = new B();

    }
}
