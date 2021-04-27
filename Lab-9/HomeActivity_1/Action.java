package HomeActivity_1;

public class Action extends Movie{
    
    public Action(String r, int id, String t) {
        super(r, id, t);
    }
    
    
    public double calcLateFee(int nod){
         lateFee = nod*3;
         return lateFee;
     }
    
}
