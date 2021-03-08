
package lab3;

public class Marks {
    private int x,y,z;
    public Marks(){
        x=10;
        y=20;
        z=30;
    }
    
    public Marks(int a, int b, int c){
        x=a;
        y=b;
        z=c;
        
    }
    
    public void displayx(){
        System.out.println(x);
    }
    
    public void displayy(){
        System.out.println(y);
    }
        
    public void displayz(){
        System.out.println(z);
    }
    
    public int Sum(){
        int sum = x+y+z;
        return sum;
    }
    
}
