class Gen<T> {
    T obj;
    Gen(T ob) {
        obj = ob;
    }
    T getObj() {
        return obj;
    }
    void show() {
        System.out.println("Class :: " + obj.getClass().getName());
    }
}

public class genericClass {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        String s = "Demo";
        Gen<Integer> obj = new Gen(i);
        Gen<String> obj1 = new Gen<>(s);

        Integer a = obj.getObj();
        System.out.println(a);

        String s1 = obj1.getObj();
        System.out.println(s1);

        //obj = obj1;   //this is not done in generic class...
        Gen<Integer> obj2 = obj;    //since both objects are of same type i.e., Integer...
        System.out.println(obj2.getObj());

        obj.show();
        obj1.show();
    }
}
