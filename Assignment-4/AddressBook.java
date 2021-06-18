package Assignment_4;

import java.io.*;
import java.util.ArrayList;


public class AddressBook implements Serializable {

    private ArrayList<Address> contacts = new ArrayList<>();

    public AddressBook() {

    }

    public void addContact(Address a) {
        contacts.add(a);
        writeFile(contacts);
    }

    public Address searchContact(String fName, String lName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(fName) && contacts.get(i).getLastName().equals(lName)) {
                return contacts.get(i);
            }
        }
        System.out.println("Task Failed");
        return null;
    }

    public void updateContact(Address a) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(a.getFirstName()) && contacts.get(i).getLastName().equals(a.getLastName())) {
                contacts.get(i).setFirstName(a.getFirstName());
                contacts.get(i).setLastName(a.getLastName());
                contacts.get(i).setPhoneNum(a.getPhoneNum());
                contacts.get(i).setAddress(a.getAddress());
                writeFile(contacts);
                System.out.println("Contact Updated Sucessfully");
            }
        }

    }

    public void deleteContact(Address a) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(a.getFirstName()) && contacts.get(i).getLastName().equals(a.getLastName())) {
                contacts.remove(i);

                writeFile(contacts);
                System.out.println("Contact Deleted Successfully");
            }

        }
    }

    public static void writeFile(ArrayList<Address> cList) {

        try {
            ObjectOutputStream objectOutStream = new ObjectOutputStream(new FileOutputStream("Address Book"));
            for (int i = 0; i < cList.size(); i++) {
                objectOutStream.writeObject(cList.get(i));
            }
            objectOutStream.close();

        } catch (EOFException ex) {
            System.out.println(ex);
        } catch (StreamCorruptedException streamCorruptedException) {

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void readFile(ArrayList<Address> cList) {
        try {
            ObjectInputStream addRead = new ObjectInputStream(new FileInputStream("Address Book"));

            for (int i = 0; i < cList.size(); i++) {

                Address acc = (Address) addRead.readObject();
                System.out.println(acc);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
