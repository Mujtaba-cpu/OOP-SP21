
package Assingments.Task_1;

public class L9Task1Runner {
    public static void main(String args[]){
        
        ClockExtended t1 = new ClockExtended(2,34,12,"PM");
        ClockExtended t2 = new ClockExtended(11,54,26,"am");
        ClockExtended t3 = new ClockExtended(5,21,02,"pm");
        System.out.println(t1.DisplayTime());
        System.out.println(t2.DisplayTime());
        System.out.println(t3.DisplayTime());
        
    }
}
