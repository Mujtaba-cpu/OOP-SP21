
package HomeActivity2;

public class ObjectCounter {
    
    
    private static int NumofObj;
    
    ObjectCounter(){
        NumofObj++;
    }
    
    public static int getObj(){
        return NumofObj;
    }
    
    public static void delete(ObjectCounter o){
        o = null;
        NumofObj--;
    }
    
}

