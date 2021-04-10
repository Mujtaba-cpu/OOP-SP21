
package Assingment;

public class L7AssingmentRunner {
    public static void main(String args[]){
        Pizza p1 = new Pizza("large",1,1,2);
        Pizza p2 = new Pizza("large",1,1,2);
        PizzaOrder p = new PizzaOrder(p1,p2);
        System.out.println("The Total Cost is: "+p.calcTotal());
        
    }
    
}
