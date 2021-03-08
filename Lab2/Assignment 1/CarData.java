/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

public class CarData {
    private String company;
    private int year;
    private String number;
    private int seats;
    private int milage;
    private int cost;
    
    public void setValue(String a, int b, String c, int d, int e,int f){
        company=a;
        year=b;
        number=c;
        seats=d;
        milage=e;
        cost=f;
    }
    
    public void display(){
    JOptionPane.showMessageDialog(null,"This Car is designed by "+company+" in year "+year+" having number "+number+". \n Seats : "+seats+" \n Milage :"+milage+" \n Cost :"+cost+"/-pkr" );
    }
    
    
}
