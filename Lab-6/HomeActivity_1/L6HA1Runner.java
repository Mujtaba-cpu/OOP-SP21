
package HomeActivity_1;

public class L6HA1Runner {
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(2.4,2000);
        SavingsAccount saver2 = new SavingsAccount(2.9,3000);
        SavingsAccount.modifyInterestRate(3);
        System.out.println("Monthly interest rate is: "+saver1.calculateMonthlyInterest());
        System.out.println("Monthly interest rate is: "+saver2.calculateMonthlyInterest());
        SavingsAccount.modifyInterestRate(4);
        System.out.println("Next Month rate is: "+saver1.calculateMonthlyInterest());
        System.out.println("Next Month rate is: "+saver2.calculateMonthlyInterest());
    }
    
}
