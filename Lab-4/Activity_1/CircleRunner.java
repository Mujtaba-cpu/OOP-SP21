/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity_1;

/**
 *
 * @author BOSS
 */
public class CircleRunner {
    public static void main (String[] args){ 
        Circle c1 = new Circle();
        c1.setRadius(5);
        c1.CalculateCircumfrance();
        int r = c1.getRadius(); 
        Circle c2 = new Circle(r);
        c2.setRadius(6);
        c2.CalculateCircumfrance();
        Circle c3 = new Circle();
        c3.CalculateCircumfrance();
    }
  
}

