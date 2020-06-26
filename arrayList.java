import java.util.*;

class class1 {

}


public class arrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        //ArrayList<DemoArray> arr = new ArrayList<DemoArray>();    //if we declare this, then it will only hold the object of DemoArray

        arr.add(10);
        arr.add(21.02);
        arr.add(100);
        arr.add(120);
        arr.add(10);
        arr.add(10.21);
        arr.add(10);
        arr.add(1012);
        arr.add(10);
        arr.add(10);
        arr.add("crimianl");
        arr.add(new DemoArray("R"));

        System.out.println("array list :: " + arr);
    }
}


class DemoArray {
    String name;
    DemoArray(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}