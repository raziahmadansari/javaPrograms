public class stringExample {
    public static void main(String[] args) {
        System.out.println(2+3);
        System.out.println(2+3+"hello");
        System.out.println("hello"+2+3);

        String s = "Hello";
        System.out.println(s.replace('l', 'w'));

        String a = "  Hello World     ";
        System.out.println(a.trim());

        String s1 = new String("abc");
        String s2 = s1;
        String s3 = s2;

        System.out.println(s1 == s2);

        //String builder
        System.out.println("\n\nString Builder");
        StringBuilder sb1 = new StringBuilder("DynamicProgrammers");
        StringBuilder sb2 = new StringBuilder("LPU");


        System.out.println(sb1.append(sb2));
        System.out.println(sb1);

        System.out.println(sb1.insert(2, sb2));

        System.out.println(sb1.replace(2, 5, ""));

        System.out.println(sb1.delete(18, 21));

        System.out.println(sb1.reverse());

        System.out.println(sb1.capacity());

        System.out.println(sb1.reverse());
    }
}
