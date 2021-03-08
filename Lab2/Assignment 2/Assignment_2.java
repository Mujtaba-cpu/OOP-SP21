
package lab2;

import javax.swing.JOptionPane;

public class Assignment_2 {

    public static void main(String args[]) {
    RectangleData rec1 = new RectangleData();
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter Length of Rectangle:"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter Width of Rectangle:"));
        rec1.setValue(a,b);
        rec1.display();
    }
}
