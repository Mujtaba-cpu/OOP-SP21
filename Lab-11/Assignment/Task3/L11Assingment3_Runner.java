package Assignment.Task3;


import static Assignment.AllTasks.CalculateAreas.Area;
import Assignment.AllTasks.Circle;
import Assignment.AllTasks.Rectangle;
import Assignment.AllTasks.Shape;
import Assignment.AllTasks.Triangle;


public class L11Assingment3_Runner {
    public static void main(String[] args) {
        Shape[] object = new Shape[5];
        object[0] = new Circle(2);
        object[1] = new Triangle(3,7);
        object[2] = new Rectangle(3,6);
        object[3] = new Rectangle(8,5);
        object[4] = new Circle(3.7);
        double[] area = Area(object);

    }
}

    