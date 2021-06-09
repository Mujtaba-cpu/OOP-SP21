package Assingment;

import java.io.*;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Account> accountList = new ArrayList<>();

        accountList.add(new Account("Mujtaba", 301, 8465));
        accountList.add(new Account("shan", 302, 5546));
        accountList.add(new Account("umiar", 303, 4566));
        accountList.add(new Account("zargham", 304, 5455));
        accountList.add(new Account("usman", 305, 4652));
        accountList.add(new Account("ayan", 306, 5465));
        accountList.add(new Account("haider", 307, 5478));
        accountList.add(new Account("shuja", 308, 2315));
        accountList.add(new Account("ayesha", 309, 5748));
        accountList.add(new Account("wania", 310, 4265));

        writeObjectToFile(accountList);
        withdraw(accountList, 1000, 301);
        withdraw(accountList, 10000, 310);
        deposit(accountList, 1000, 302);
        transfer(accountList, 1000, 304, 305);
        ReadObjectFromFile(accountList);

    }

    public static void withdraw(ArrayList<Account> acc, int amount, int acNum) {

        for (int i = 0; i < acc.size(); i++) {
            if (acc.get(i).accNo == acNum) {
                if (amount > acc.get(i).balance) {
                    System.out.println("Insufficent Balance");
                } else {
                    acc.get(i).balance = acc.get(i).balance - amount;
                    System.out.println("Transaction Successful");
                }

            }
        }

        writeObjectToFile(acc);

    }

    public static void deposit(ArrayList<Account> acc, int amount, int acNum) {

        for (int i = 0; i < acc.size(); i++) {
            if (acc.get(i).accNo == acNum) {
                acc.get(i).balance = acc.get(i).balance + amount;
                System.out.println("Transaction Successful");
            }
        }

        writeObjectToFile(acc);

    }

    public static void transfer(ArrayList<Account> acc, int amount, int senderacc, int reciveracc) {

        for (int i = 0; i < acc.size(); i++) {
            if (acc.get(i).accNo == senderacc && amount > acc.get(i).balance) {
                System.out.println("Insufficent Balance");
            } else if (acc.get(i).accNo == senderacc && amount < acc.get(i).balance) {
                acc.get(i).balance = acc.get(i).balance - amount;
                System.out.println(amount + " Sent to: " + reciveracc);

            }
        }
        for (int i = 0; i < acc.size(); i++) {
            if (acc.get(i).accNo == reciveracc) {
                acc.get(i).balance = acc.get(i).balance + amount;
                System.out.println(amount + " Recived from: " + senderacc);
            }
        }
        writeObjectToFile(acc);
    }

    public static void writeObjectToFile(ArrayList<Account> acc) {

        try {
            ObjectOutputStream objectOutStream = new ObjectOutputStream(new FileOutputStream("Account Management"));
            for (int i = 0; i < acc.size(); i++) {
                objectOutStream.writeObject(acc.get(i));
            }
            objectOutStream.close();

        } catch (EOFException ex) {
            System.out.println(ex);
        } catch (StreamCorruptedException streamCorruptedException) {

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void ReadObjectFromFile(ArrayList<Account> acList) {
        try {
            ObjectInputStream accRead = new ObjectInputStream(new FileInputStream("Account Management"));

            for (int i = 0; i < acList.size(); i++) {

                Account acc = (Account) accRead.readObject();
                System.out.println(acc);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
