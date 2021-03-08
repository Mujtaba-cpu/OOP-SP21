
package lab2;

import javax.swing.JOptionPane;


public class RectangleData {
    private int length;
    private int width;
    private int area,parameter;
    public void setValue(int a,int b){
        length=a;
        width=b;
        area=length*width;
        parameter=(2*length)+(2*width);
    }
    public void display(){
        JOptionPane.showMessageDialog(null,"Rectangle has a width of "+width+" and length of "+length+"\n Area is : "+length+"*"+width+"="+area+"\n Parameter is :"+parameter);
    }
    
}

