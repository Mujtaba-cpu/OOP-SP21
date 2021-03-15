
package Assingment;


public class Hotdog {
    private int Id, sold;
    
    public Hotdog(int i, int s){
        Id = i;
        sold= s;
    }
     public void justSold(){
         sold = sold+1;
     }
     public void display(){
         System.out.println("The Total number of hotdogs sold is; "+sold);
     }
         
}
