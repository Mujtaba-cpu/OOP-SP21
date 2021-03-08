
package lab3;

public class Distance {
     private int feet;
    private double inch;
    public Distance(){
        feet=5;
        inch=3;
    }
    
    public Distance(int a, double b){
        feet=a;
        inch=b;
    }
    
    public void Display(){
        System.out.println("Distance is :"+feet+" feets "+inch+" inches");
    }


    
}
