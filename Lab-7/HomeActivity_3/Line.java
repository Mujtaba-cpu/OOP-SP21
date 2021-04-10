
package HomeActivity_3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {
  private Point startPoint;
  private Point endPoint;
  
  Line(Point p1, Point p2){
      startPoint=p1;
      endPoint=p2;
  }
  public double findLength(){
     double x = sqrt(pow((endPoint.x_cord-startPoint.x_cord),2) + pow((endPoint.y_cord-startPoint.y_cord),2));
     return x;
  }
}
