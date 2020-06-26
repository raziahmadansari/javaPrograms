import javax.sql.rowset.serial.SerialStruct;

class A {
    void m1() {
        System.out.println("m1 of A");
    }
}

class B extends A {
    void m1() {
        System.out.println("m2 of B");
    }

    void m3() {
        System.out.println("m3 of B");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.m1();
        ((B) obj).m3();
        //obj.m3();       //this will give error because there
                        //is no function in the super class to override
    }
}
