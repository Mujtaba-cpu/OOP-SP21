/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity_1;

/**
 *
 * @author Maliks
 */
public class Distance {
    public int feet, inc;
    
    public Distance(){
        feet = 0;
        inc = 0;
    }
    
    public Distance(int a, int b){
        feet = a;
        inc = b;
    }
    
    public void Setfeet(int a){
        feet =a;
    }
    
    public void Setinches(int b){
        inc =b;
    }
    
    public int Getfeet(){
        return feet;
    }
    
    public int GetInches(){
        return inc;
    }
     
    public Distance Add(Distance x, Distance y){
        Distance d = new Distance(feet+x.feet+y.feet,inc+x.inc+y.inc );
        return d;
    }
    
    public void Display(){
        System.out.println("The Distance is: "+ feet+","+inc);
    }
    
    
    

}
