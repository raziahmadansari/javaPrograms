class initializer_block {
    {
        System.out.println("A");
    }

    void initializer_block() {
        System.out.println("b");
    }

    static
    {
        System.out.println("c");
    }

    {
        System.out.println("d");
    }

    initializer_block() {
        System.out.println("consturctor without parameter");
    }

    initializer_block(int a) {
        System.out.println("constructor with parameter");
    }

    public static void main(String[] args) {
        /*initializer_block obj = new initializer_block();
        initializer_block obj2 = new initializer_block(10);*/
    }
}
