/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingment;

/**
 *
 * @author Maliks
 */
public class L5AssingmentRunner {
    public static void main(String args[]){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(12,3);
        Fraction f3 = new Fraction();
        f1.Set(12, 3);
        f3.Set(25, 4);
        f1.Display();
        f3.Display();
        System.out.println(Fraction.equals(f1, f2));
        
    }
}
