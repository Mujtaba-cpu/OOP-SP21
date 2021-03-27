
package HomeActivity_1;

public class SavingsAccount {
    static double annualInterestRate; //static var
    private int savingsBalance;
    
    public SavingsAccount(double x, int y){
        annualInterestRate = x;
        this.savingsBalance = y;
    }
    
     public double calculateMonthlyInterest(){
        return (annualInterestRate * savingsBalance )/ 12;
    }
    
    public static void modifyInterestRate(double interestRate){
        annualInterestRate = interestRate;
    }
    
}
