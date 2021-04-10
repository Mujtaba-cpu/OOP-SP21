/*
Now Create a PizzaOrder class that allows up to three pizzas to be saved in an order. Each
pizza saved should be a Pizza object. Create a method calcTotal() that returns the cost of
order.
In the runner order two pizzas and return the total cost.
 */
package Assingment;

public class PizzaOrder {
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;
    private double tCost;
    
    PizzaOrder(Pizza x1){
        p1=x1;
        
    }
    
    PizzaOrder(Pizza x1,Pizza x2){
        p1=x1;
        p2=x2;
        
    }
    
    PizzaOrder(Pizza x1,Pizza x2, Pizza x3){
        p1=x1;
        p2=x2;
        p3=x3;
    }
    
    public double calcTotal(){
        if(p3==null && p2 == null){
            tCost = p1.calcCost();
        }else if(p3 == null){
            tCost = p1.calcCost()+p2.calcCost();
        }else{
            tCost = p1.calcCost()+p2.calcCost()+p3.calcCost();
        }
        return tCost;
    }
    
}
