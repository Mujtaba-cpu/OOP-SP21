/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity_2;

/**
 *
 * @author BOSS
 */
public class Account {
    private int balance;
    
    public Account(){
        balance = 50000;
    }
    
    public void deposit(int a){
        balance = balance + a;
    }
    public void withdraw(int a){
        balance = balance - a;
    }
    public void display(){
        System.out.println("The Total Balance: "+balance);
    }
    
}
