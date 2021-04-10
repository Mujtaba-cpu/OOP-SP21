
package HomeActivity_3;


public class Point {
    public int x_cord;
    public int y_cord;
    
    public Point(int x, int y){
        x_cord=x;
        y_cord=y;
    }
    
    public void setXcord(int s){
        x_cord = s;
    }
    public void setYcord(int a){
        y_cord = a;
    }
    
    public int getXcord(){
        return x_cord;
    }
    public int getYcord(){
        return y_cord;
    }
    
    public void display(){
        System.out.println("The point is: ("+x_cord+"'"+y_cord+")");
    }
}
