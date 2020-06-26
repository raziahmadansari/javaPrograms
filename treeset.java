import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    String name;
    String designation;
    int salary;

    Employee(String name, String designation, int salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(salary > o.salary)  return 1;
        else if(salary < o.salary) return -1;
        else return 0;
    }

    public String toString() {
        return name + " " + designation + " " + salary;
    }
}

public class treeset {
    public static void main(String[] args) {
        TreeSet<Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee("abc", "abc", 100000));
        treeSet.add(new Employee("abcd", "abc", 200000));
        treeSet.add(new Employee("abcde", "abc", 40000));
        treeSet.add(new Employee("abcdef", "abc", 50000));
        treeSet.add(new Employee("abcdefg", "abc", 60000));
        treeSet.add(new Employee("abcdefgh", "abc", 500000));
        treeSet.add(new Employee("abcdefghi", "abc", 1100000));

        Iterator i = treeSet.iterator();
        while(i.hasNext())  System.out.println(i.next().toString());

        for(Employee s : treeSet) {
            System.out.println(s.name + " " + s.designation + " " + s.salary);
        }


    }
}
