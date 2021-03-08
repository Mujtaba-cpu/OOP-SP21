
package lab3;

import java.util.Scanner;


public class Assignment_1 {

    public static void main(String args[]) {
      int x,y,z,sum;
      Marks m1=new Marks();
      sum=m1.Sum();
      System.out.println("The Sum is : "+sum);
      
      Scanner in = new Scanner(System.in);
        System.out.println("\nEnter 3 numbers :");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        Marks m2= new Marks(x,y,z);
        sum=m2.Sum();
        System.out.println("The Sum is : "+sum);
    }
}
