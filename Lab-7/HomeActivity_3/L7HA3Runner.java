
package HomeActivity_3;

public class L7HA3Runner {
    public static void main(String args[]){
        Point p1 = new Point(4,10);
        Point p2 = new Point(8,24);
        Point p3 = new Point(56,10);
        Point p4 = new Point(32,56);
        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p3,p4);
        System.out.println("The Length of line 1 is:"+ l1.findLength());
        System.out.println("The Length of line 2 is:"+ l2.findLength());
        
    }
}
