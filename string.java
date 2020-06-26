public class string {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        if(s1 == s2)
            System.out.println("s1 == s2");
        if(s1 == s3)
            System.out.println("s1 == s3");

        //UNTILL AND UNLESS WE WILL NOT CHANGE THE VALUE OF STRING
        //JVM WILL ALLOCATE THE SAME MEMORY LOCATION TO BOTH S1 AND S2
        //WHILE IN CASE OF S3 WE CALL THE CONSTRUCTOR SO IT REALLOCATE THE
        //MEMORY FOR S3...
    }
}
