
package Activity_2;

public class L9A2Runner {
 
    public static void main(String args[]){

        BasePlusCommEmployee b = new BasePlusCommEmployee("ali", "ahmed", "25-knn",100.0, 5.2, 25000.0);
        double earn = b.earnings();
        System.out.println("Earning of employee is "+ earn);

    }
}

