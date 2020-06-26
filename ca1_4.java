import java.util.*;

public class ca1_4 {
    public static void main(String[] args) {
        Dictionary contact = new Hashtable();

        Scanner sc = new Scanner(System.in);

        String name = "";
        String number = "";

        while(true) {
            System.out.print("Enter name to search :: ");
            name = sc.nextLine();
            //sc.next();
            if(((Hashtable) contact).containsKey(name)) {
                System.out.println("contact no. = " + contact.get(name));
            }
            else {
                System.out.println("We don't have number of " + name);
                System.out.print("Enter number :: ");
                number = sc.nextLine();
                contact.put(name, number);
                System.out.println("Contact list has been updated...\n");
            }
            //sc.nextLine();
        }
    }
}
