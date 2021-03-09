/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity_2;

/**
 *
 * @author BOSS
 */
public class Rectangle {
    private int length;
    private int width;
    
    public Rectangle(){
        length = 4;
        width = 5;
                      
    }
    
    public Rectangle(int l,int w){
        l = length;
        w = width;
    }
    
    public void SetLen(int l){
        l = length;
    }
    public void SetWidth(int w){
        w = width;
    }
    public int GetLen(){
        return length;
    }
    public int GetWidth(){
        return width;
    }
    public void area(){
        int a = length*width;
        System.out.println("The Area of Rectangle Is "+ a);
    }
}
