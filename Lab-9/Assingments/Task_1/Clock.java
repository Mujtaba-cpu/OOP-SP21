/*
 *Implement a Clock class that simulates time in hr:min:sec, derive a child class that
overrides the display method and displays the time in both AM/PM and 24 hour format. */
package Assingments.Task_1;

public class Clock {
     private int hr,min,sec;

    public Clock(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void setHours(int h) {
        this.hr = h;
    }
    public void setMinutes(int m) {
        this.min = m;
    }
    public void setSeconds(int s) {
        this.sec = s;
    }

    public int getHours() {
        return hr;
    }
    public int getMinutes() {
        return min;
    }
    public int getSeconds() {
        return sec;
    }

    public String DisplayTime(){
        return hr+":"+min+":"+sec;
    }
    
}
