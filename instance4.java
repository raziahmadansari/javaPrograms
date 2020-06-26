public class instance4 {
    public static void main(String[] args) {
        A obj = new B();
        if(obj instanceof B) {
            B obj2 = (B) obj;
            obj2.m1();
        }
        else
            System.out.println("wrong type casting...");
    }
}
