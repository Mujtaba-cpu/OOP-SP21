
package lab3;

import java.util.Scanner;

public class Home_Activity_2 {

    public static void main(String args[]) {
     Account a1= new Account();
        System.out.println("Your Current Balance is : 1050");
        System.out.println("Press 1 to deposit Funds or Press 2 to Withdrew Funds : ");
        Scanner s1=new Scanner(System.in);
        int choice = s1.nextInt();
        if (choice==1){
            a1.Deposit(200);
        }
        else{
          a1.Withdraw(100);  
        }
       
        System.out.println("\nEnter Your Balance: ");
        int bal= s1.nextInt();
     Account a2= new Account(bal);
        System.out.println("Press 1 to deposit Funds or Press 2 to Withdrew Funds : ");
        choice = s1.nextInt();
        if (choice==1){
            bal= s1.nextInt();
            a2.Deposit(bal);
        }
        else{
            bal= s1.nextInt();
          a2.Withdraw(bal);  
        }
    }
}
