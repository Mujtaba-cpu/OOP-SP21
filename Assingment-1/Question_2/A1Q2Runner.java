/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;


public class A1Q2Runner {

    public static void main(String args[]) {
        Bus b1 = new Bus();
        System.out.println(b1.bookSeat("Mujtaba"));
        System.out.println(b1.bookSeat("Shuja", "a"));
        String[] x = {"sh", "mu", "xy", "zy"};
       
        System.out.println(b1.bookSeat(x, 4));

        System.out.println(b1.getVacantSeatCount());
        b1.showBookings();

    }

 }
