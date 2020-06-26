interface X1 {
    void show();
    abstract void display();
}

interface Y1 {
    void show();
    abstract void display();
}

class Test implements X1, Y1 {
    public void show() {
        System.out.println("show");
    }

    public void display() {
        System.out.println("display");
    }
}

public class MyClass extends Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.display();
        obj.show();
    }
}
