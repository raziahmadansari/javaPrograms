enum Day {
    MON, TUE;
}

public class enum1 {
    public static void main(String[] args) {
        Day d[] = Day.values();
        for(Day d1:d)
            System.out.println(d1);
    }
}
