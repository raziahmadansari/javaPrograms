public class brainStorming2 {

    final static int x[] = new int[5];  //array index is from 0 to 4 and the default values are "0"

    public static void main(String[] args) {
        int x = new brainStorming2().x[5];  //usign this we are accessing the x[5] which is out of bound
        if(x <= 10)
            System.out.println("javaChamp");
    }
}
