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
public class AccountRunner {
    public static void main(String[] args){
        Account a1 = new Account();
        Account a2 = new Account();
        a1.deposit(500);
        a1.display();
        a2.withdraw(850);
        a2.display();
    }
}

