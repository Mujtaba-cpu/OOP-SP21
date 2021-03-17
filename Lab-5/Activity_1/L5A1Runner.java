/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity_1;

/**
 *
 * @author Maliks
 */
public class L5A1Runner {
    public static void main(String args[]){
        Object p = new Object();
        p.value=10;
        System.out.println("Value Before Calling function: " + p.value);
        Object.increment(p);
        System.out.println("Value After Calling function: "+ p.value);
    }
}
