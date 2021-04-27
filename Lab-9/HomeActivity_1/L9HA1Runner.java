package HomeActivity_1;

public class L9HA1Runner {
    public static void main(String args[]){
        Action a = new Action("R",464,"The Last Journey");
        Comedy c = new Comedy("PG-13",464,"The Elongated Man");
        Drama d = new Drama("G",234,"Alice's Drama");
        
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        
        System.out.println("Your Late fee is:" + a.calcLateFee(1));
        System.out.println("Your Late fee is:" + c.calcLateFee(1));
        System.out.println("Your Late fee is:" + d.calcLateFee(1));
    }
    
}
