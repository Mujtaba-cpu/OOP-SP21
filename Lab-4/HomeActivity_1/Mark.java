/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity_1;

/**
 *
 * @author BOSS
 */
public class Mark {
    private int x;
    private int y;
    private int z;
    
    public Mark(){
        x=10;
        y=20;
        z=30;
    }
    
    public Mark(int a, int b, int c){
        a=x;
        b=y;
        c=y;
    }
    
    public void Setx(int a){
        x =a ;
    }
    public void Sety(int a){
        y =a ;
    }
    public void Setz(int a){
        z =a ;
    }
    public int Getx(){
        return x;
    }
    public int Gety(){
        return y;
    }
    public int Getz(){
        return z;
    }
    
    public void display(){
        System.out.println(x+","+y+","+z);
    }
}
