class Gen2 {
    Object obj;
    Gen2(Object ob) {
        obj = ob;
    }
    Object getObj() {
        return obj;
    }
    void show() {
        System.out.println("Class :: " + obj.getClass().getName());
    }
}

public class genericClass2 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        String s = "Demo";
        Gen2 obj = new Gen2(i);
        Gen2 obj1 = new Gen2(s);

        //Integer a = obj.getObj();
        Integer a = (Integer)obj.getObj();  //explicit type casting needed
        System.out.println(a);

        //String s1 = obj1.getObj();
        String s1 = (String)obj1.getObj();  //explicit type casting needed
        System.out.println(s1);

        obj = obj1; //we can do it because it is subclass of object class...but it is not possible in generic type
        obj.show();
        obj1.show();
    }
}
