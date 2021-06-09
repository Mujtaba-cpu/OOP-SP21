
package Assingment;

import java.io.*;
/*Create an ATM System with Account as the Serializable class. Write ten objects of Account
in a file. Now write functions for withdraw, deposit, transfer and balance inquiry.
Note:
a. Each function should ask for the account number on which specific operation should
be made.
b. All changes in Account object should be effectively represented in the file. */
public class Account implements Serializable{
    public String name;
    public int accNo;
    public double balance;

    public Account(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }
    
    @Override
    public String toString(){
        return "Name: "+name+"\nAccount Number: "+accNo+"\nTotal Balance"+balance+"\n------------------";
    }
   

   
}


