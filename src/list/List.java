package list;
import person.Person;

import java.util.ArrayList;
import java.util.Scanner;
public class List {
    Scanner scan = new Scanner(System.in);
    ArrayList<Person> list1 = new ArrayList<Person>();

    public List(String firstName, String lastName, String emailID) {
    }
    public List() {
        super();
    }
    int top = 0;
    Person p;
    public void addNewContact() {
        System.out.println("Enter first name ::");
        String m = scan.nextLine();
        System.out.println("Enter last name ::");
        String v = scan.nextLine();
        System.out.println("Enter emailId ::");
        String c = scan.nextLine();
        p = new Person(m,v,c);
        System.out.println("Enter phoneNumber ::");
        p.setPhoneNumber();
        list1.add(p);
        top++;
    }
}
