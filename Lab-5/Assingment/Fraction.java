/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingment;


public class Fraction {
    public int a,b;
    
    public Fraction(){
        a = 0;
        b = 0;
    }
    
    public Fraction(int x,int y){
        a = x;
        b = y;
    }
    
    public void Set(int m, int u){
        a = m;
        b= u;
    }
    
    public int Geta(){
        return a;
    }
    
    public int Getb(){
        return b;
    }
    
  public void Display(){
        double fraction;
        fraction = (double) a/(double) b;
        System.out.println("The ratio of two integers is: "+ fraction);
    }
    public static boolean equals(Fraction x, Fraction y){
        if (x.a==y.a & x.b == y.b){
            return true;
        }else{
            return false;
        }
    }
}
