
package Assingment;

/**
Create a class named Pizza that stores information about a single pizza. It should contain the
following:
 Private instance variables to store the size of the pizza (either small, medium, or
large), the number of cheese toppings, the number of pepperoni toppings, and the
number of ham toppings./
* 
* 
 Constructor(s) that set all of the instance variables.
 Public methods to get and set the instance variables.
* 
* 
 A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
 public method named getDescription( ) that returns a String containing the pizza size,
quantity of each topping.
Write test code to create several pizzas and output their descriptions. For example, a large
pizza with one cheese, one pepperoni and two ham toppings should cost a total of $22.

 */
public class Pizza {
    private String size;
    private int cheeseToping;
    private int pepperoniToping;
    private int hamToping;
   private double cost;
    
    public Pizza(String s, int ct, int pt, int ht){
        size = s;
        cheeseToping = ct;
        pepperoniToping = pt;
        hamToping = ht;
    }
    
    public void setSize(String s){
        size = s;
    }
    public void setChesseToping(int ct){
        cheeseToping = ct;
    }
    public void setPepperoniToping(int pt){
        pepperoniToping = pt;
    }
    public void setHamToping(int ht){
        hamToping = ht;
    }
    
    public String getSize(){
        return size;
    }
    public int getCheeseTopin(){
        return cheeseToping;
    }
    public int getPepperoniTopin(){
        return pepperoniToping;
    }
    public int getHamTopin(){
        return hamToping;
    }
    
    public double calcCost(){
        if (size == "small"){
            cost = 10+((2*cheeseToping)+(2*pepperoniToping)+(2*hamToping));
            return cost;
        }else if(size == "medium"){
            cost = 12+((2*cheeseToping)+(2*pepperoniToping)+(2*hamToping));
            return cost;
        }else if(size == "large"){
            cost = 14+((2*cheeseToping)+(2*pepperoniToping)+(2*hamToping));
            return cost;
        }else{
            System.out.println("Invalid Input");
        }
        return cost;
    }
    
    public String getDescription(){
        return "Size is: "+ size + "\nNumber of Cheese Topings is: "+Integer.toString(cheeseToping) + "\nNumber of Pepperoni Topings is: "+Integer.toString(pepperoniToping)+ "\nNumber of Ham Topings is: "+Integer.toString(hamToping) ;
        
    }
    
    
}
