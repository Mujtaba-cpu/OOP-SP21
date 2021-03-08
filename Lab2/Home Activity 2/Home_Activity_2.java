
package lab2;

public class Home_Activity_2 {

    public static void main(String args[]) {
        Time t1, t2;
        t1 = new Time();
        t1.hours = 11;
        t1.mint = 31;
        t1.sec = 27;
        t1.AM_PM="AM";
        System.out.println("Time1:");
        t1.display();
        t2 = new Time();
        t2.hours = 9;
        t2.mint = 15;
        t2.sec = 30;
        t2.AM_PM="PM";
        System.out.println("Time2:");
        t2.display();
    }
}
