/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity_3;

/**
 *
 * @author BOSS
 */
public class point {
    private int x;
    private int y;
    
    
    public point(){
        x = 4;
        y= 5;
    }
    
    public point(int a, int b){
        a=x;
        b=y;
    }
    
    public void SetX(int a){
        x= a;
    }
    public void SetY(int b){
        y= b;
    }
    public int Getx(){
       return x;
    }
    public int GetY(){
        return y;
    }
    public void display(){
        System.out.println("the X cordinate is: "+x+"the Y cordinate is: "+y);
    }
}
