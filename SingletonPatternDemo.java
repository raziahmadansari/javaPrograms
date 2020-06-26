class DemoSingle {
    private static DemoSingle obj = new DemoSingle();

    private DemoSingle() {}

    public static DemoSingle method() {
        return obj;
    }

    public void abc() {
        System.out.println("hello...");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        DemoSingle obj = DemoSingle.method();
        obj.abc();
    }
}
