package main;
import person.Person;
import list.List;
import menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu m1 = new Menu();
        List t2 = new List();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Welcome  to contacts menu 1 to addContacts,2 to view contacts,3 to search contacts,4 to delete contacts,5 to end::: " );
        m1.menu(sc.nextInt());
        String i = "y";
        while(i.equals("y")) {
            m1.menu(sc.nextInt());
            System.out.println("want to try more y/n?");
            sc.nextLine();
            i = sc.nextLine();
        }
    }
}
