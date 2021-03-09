/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingment;

/**
 *
 * @author BOSS
 */
public class HotdogRunner {
    public static void main(String[] args){
        Hotdog h1 = new Hotdog(101,0);
        Hotdog h2 = new Hotdog(102,0);
        Hotdog h3 = new Hotdog(103,0);
        h1.justSold();
        h1.display();
        h2.justSold();
        h2.display();
        h3.justSold();
        h3.justSold();
        h3.display();
    }
}
