package Assingmnet.Task2;

import Assignment.AllTasks.Circle;
import Assignment.AllTasks.Rectangle;
import Assignment.AllTasks.Triangle;



public class L11Assingment2_Runner {

    public static void main(String[] args) {
       
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(4.7, 5);
        Rectangle rectangle = new Rectangle(3, 5.6);
        
        System.out.println("The area is: "+circle.area());
        System.out.println("The area is: "+triangle.area());
        System.out.println("The area is: "+rectangle.area());
    }
    
}
