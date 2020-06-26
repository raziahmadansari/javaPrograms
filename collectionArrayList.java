import java.lang.reflect.Array;
import java.util.*;

public class collectionArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("abc");
        arr.add("xyz");
        arr.add("abcd");
        arr.add("abc");

        System.out.println(arr);

        removeDuplicate(arr);
        System.out.println();
        removeDuplicateLinkedHashSet(arr);
    }

    static void removeDuplicate(ArrayList<String> al) {
        Collection<String> obj = new TreeSet<String>();
        obj.addAll(al);
        Iterator itr = obj.iterator();
        while(itr.hasNext()) {
            System.out.println("" + itr.next());
        }
    }

    static void removeDuplicateLinkedHashSet(ArrayList<String> al) {
        Collection<String> obj = new HashSet<>();
        obj.addAll(al);
        Iterator itr = obj.iterator();
        while(itr.hasNext())    System.out.println(itr.next());
    }
}
