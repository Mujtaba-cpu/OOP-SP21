
package HomeActivity_1;

public class Drama extends Movie{
    
    public Drama(String r, int id, String t) {
        super(r, id, t);
    }
    public double calcLateFee(int nod){
         return super.calcLateFee(nod);
     }
    
}
