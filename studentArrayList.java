import java.util.ArrayList;
class student {
    int id;
    String name;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String data() {
        return id + " " + name;
    }

    /*@Override
    public String toString() {
        return id + " " + name;
    }*/
}

public class studentArrayList {
    public static void main(String[] args) {
        ArrayList<student> myStudent = new ArrayList();

        myStudent.add(new student(110, "abc"));
        myStudent.add(new student(111, "xyz"));


        for(int i = 0; i < myStudent.size(); i++)
            System.out.println(myStudent.get(i).data());

    }
}
