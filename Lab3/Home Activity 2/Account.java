
package lab3;

public class Account {
     private int balance;
    private int x;
    private int y;
    public Account(){
        balance=1050;

    }
    
    public Account(int a){
        balance=a;
    }
    
    public void Deposit(int a){
        balance=balance+a;
        System.out.println("You deposited "+ a+"Rs.\n New balance is : "+balance);
        
    }
    
    public void Withdraw(int a){
        balance=balance-a;
        System.out.println("You Withdrew "+ a+"Rs.\n New balance is : "+balance);
    }
}
