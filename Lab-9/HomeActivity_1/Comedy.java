
package HomeActivity_1;

public class Comedy extends Movie {
    
    public Comedy(String r, int id, String t) {
        super(r, id, t);
    }
    public double calcLateFee(int nod){
         lateFee = nod*2.50;
         return lateFee;
     }
    
}
