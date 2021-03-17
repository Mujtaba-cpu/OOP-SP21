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
public class L5HA1Runner {
    public static void main(String args[]){
        Distance d1 = new Distance();
        Distance d2 = new Distance(3,9);
        Distance d3 = new Distance(2,7);
        Distance d4 = d1.Add(d2,d2);
        d4.Display();
    }
}
