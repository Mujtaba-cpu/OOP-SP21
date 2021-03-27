
package Activity_3;


public class abc {
   
    public static int i ; //static var
    public String s;

    public static void displayStatic(){ //Static method
        System.out.println("i:"+i);
    }
    
    public void display(){ //non static method
       System.out.println("i:"+i);
       System.out.println("s:"+s);
    }
    
}

