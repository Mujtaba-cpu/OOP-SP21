
package Activity_2;


public class Objects {
    private static int obj=0;
    private int a;
    public Objects(){
        obj++;
    }
    public Objects(int x){
        a=x;
        obj++;
    }
    public static int getObject (){
        return obj;
    }
}



