class E {
    void m2() {
        System.out.println("A");
    }
}

class F extends E {
    void m2() {
        System.out.println("A");
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        E obj = new E();
        //F obj2 = obj;
        F obj2 = (F) obj;
        obj2.m2();
    }
}
