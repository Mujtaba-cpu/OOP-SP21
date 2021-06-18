package Assignment_4;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws Exception {
        //adresses
        Address a = new Address("Mujtaba", "Ahmed", "5467", "Isb");
        Address a1 = new Address("Sheharyar", "Tariq", "856", "Fsd");
        Address a2 = new Address("Zargham", "Javed", "4558", "Mgl");
        Address a3 = new Address("Shuja", "Ahmed", "4558", "Mrp");
        Address a4 = new Address("Usman", "Malik", "4558", "Gjw");
        Address a5 = new Address("Ayan", "Malik", "4558", "Lhr");
        // creating address book

        AddressBook ab = new AddressBook();
        //adding to book
        ab.addContact(a);
        ab.addContact(a1);
        ab.addContact(a2);
        ab.addContact(a3);
        ab.addContact(a4);
        ab.addContact(a5);
        //CRUD
        int n = 1;
        Scanner key = new Scanner(System.in);
        while (n != 0) {
            String fn;
            String ln;
            String ph;
            String add;

            int choice = 0;
            System.out.println("Please Enter one of the following:");
            System.out.println("1.Enter new contact\n2.Search contact\n3.Update contact\n4.Delete contact\n5.Display");
            choice = key.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("------ADD CONTACT--------");
                    System.out.println("Please Enter First Name:");
                    key.nextLine();
                    fn = key.nextLine();
                    System.out.println("Please Enter Last Name:");
                    ln = key.nextLine();
                    System.out.println("Please Enter Phone Number:");
                    ph = key.nextLine();
                    System.out.println("Please Enter Address");
                    add = key.nextLine();
                    ab.addContact(new Address(fn, ln, ph, add));
                    System.out.println("Contact Added Successfully");
                    break;
                case 2:
                    System.out.println("------SEARCH CONTACT--------");
                    System.out.println("Please Enter First Name:");
                    key.nextLine();
                    fn = key.nextLine();
                    System.out.println("Please Enter Last Name:");
                    ln = key.nextLine();
                    System.out.println(ab.searchContact(fn, ln));
                    break;
                case 3:
                    System.out.println("------UPDATE CONTACT--------");
                    System.out.println("PLease Enter Updated Details");
                    System.out.println("Please Enter First Name:");
                    key.nextLine();
                    fn = key.nextLine();
                    System.out.println("Please Enter Last Name:");
                    ln = key.nextLine();
                    System.out.println("Please Enter Phone Number:");
                    ph = key.nextLine();
                    System.out.println("Please Enter Address");
                    add = key.nextLine();
                    ab.updateContact(new Address(fn, ln, ph, add));
                    break;
                case 4:
                    System.out.println("------DELETE CONTACT--------");
                    System.out.println("PLease Enter Details about Account to be Deleted");
                    key.nextLine();
                    System.out.println("Please Enter First Name:");
                    fn = key.nextLine();
                    System.out.println("Please Enter Last Name:");
                    ln = key.nextLine();
                    System.out.println("Please Enter Phone Number:");
                    ph = key.nextLine();
                    System.out.println("Please Enter Address");
                    add = key.nextLine();
                    Address d = new Address(fn, ln, ph, add);
                    ab.deleteContact(d);
                    break;
                case 5:
                    display();
                    break;
                default:
                    break;
            }
            System.out.println("Press 1 to continue and 0 to exit");
            n = key.nextInt();
        }
    }

    public static void display() throws Exception {
        FileInputStream input = new FileInputStream("Address Book");
        ObjectInputStream addRead = new ObjectInputStream(input);

        try {
            while (true) {
                Address b = (Address) addRead.readObject();
                System.out.println(b);
            }
        } catch (Exception e) {
        }

        addRead.close();
    }

}
