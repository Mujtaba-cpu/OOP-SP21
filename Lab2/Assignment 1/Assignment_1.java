
package lab2;

import javax.swing.JOptionPane;

public class Assignment_1 {

    public static void main(String args[]) {
        CarData car1= new CarData();
        String a=JOptionPane.showInputDialog("Enter Company Name:");
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter Model Year:"));
        String c=JOptionPane.showInputDialog("Enter Car Number:");
        int d=Integer.parseInt(JOptionPane.showInputDialog("Enter Number of seats:"));
        int e=Integer.parseInt(JOptionPane.showInputDialog("Enter Milage(Km/ltr):"));
        int f=Integer.parseInt(JOptionPane.showInputDialog("Enter Car Cost:"));
        car1.setValue(a,b,c,d,e,f);
        car1.display();
 
    }
}
