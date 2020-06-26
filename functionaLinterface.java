import java.util.ArrayList;

@FunctionalInterface
interface abc {
    boolean test(String t);
}

public class functionaLinterface {
    public static void main(String[] args) {
        abc obj = (t) -> {
            if(t.endsWith("g")) return true;
            else return false;
        };

        ArrayList<String> myArray = new ArrayList();
        myArray.add("abcdg");
        myArray.add("xyz");
        myArray.add("lmng");
        myArray.add("stuvg");
        myArray.add("sfre");
        myArray.add("ougz");

        for(String X : myArray) {
            if(obj.test(X))  System.out.println(X);
        }
    }
}
