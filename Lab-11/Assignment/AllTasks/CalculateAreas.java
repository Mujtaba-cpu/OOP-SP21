package Assignment.AllTasks;

import java.util.Scanner;

public class CalculateAreas {
    
    public static double[] Area(Object[] shape){
        double[] area = new double[shape.length];
        for(int i = 0; i< area.length;i++){
            if(shape[i] instanceof Rectangle){
                area[i] = ((Rectangle) shape[i]).area();
                System.out.println((i+1)+". Object is a Rectangle with area "+area[i]);
            } else if(shape[i] instanceof Circle){
                area[i] = ((Circle) shape[i]).area();
                System.out.println((i+1)+". Object is a Circle with area "+area[i]);
            } else {
                area[i] = ((Triangle) shape[i]).area();
                System.out.println((i+1)+". Object is a Triangle with area "+area[i]);
            }
        }
        return area;
    }
}