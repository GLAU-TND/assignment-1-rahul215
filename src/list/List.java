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
}
