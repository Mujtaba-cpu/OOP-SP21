
package lab3;

public class Circle {
    private int r;
    private double pi;
    public Circle(){
        r=5;
        pi=3.14;
    }
    
    public Circle(int a, double b){
        r=a;
        pi=b;
    }
    
    public void Circum(){
        System.out.println("Circumference of Circle is : "+2*r*pi);
    }
}
