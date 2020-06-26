public class practice2 {
    static char j;
    public static void main(String[] args) {
        int i = (int) j;
        System.out.println(i);
        int a = -13, b = 2;
        System.out.println(a<<b);
        System.out.println(-103>>2);
        System.out.println(~(2));
        int[] arr = new int[5];
        for(int x : arr)
            System.out.print(x + " ");
        System.out.println("\n" + (2&4));
        if(1+1+1+1+1 == 5)  System.out.println("it works");

        String s1 = "java";
        String s2 = new String("java");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        byte b1 = 127;
        System.out.println(++b1);
    }
}
