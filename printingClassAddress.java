public class printingClassAddress {
    public static void main(String[] args) {
        System.out.println(new printingClassAddress());
        //JVM implicitly call the toString() function.
        //System.out.println(new printingClassAddress().toString());
    }

    //toString function overriding
    public String toString() {
        return "Hello";
    }
}
