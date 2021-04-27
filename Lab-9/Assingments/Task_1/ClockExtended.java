package Assingments.Task_1;

public class ClockExtended extends Clock {
        protected String midday;

    public ClockExtended(int hr, int min, int sec,String m){
        super(hr,min,sec);
        
        this.midday=m;
    }
    
    private void ChangeFormat(){ 
       
            if (midday.equalsIgnoreCase("PM")){
                int hour = getHours();
                hour = hour + 12;
                setHours(hour);
            }
        
    }
    
    public String DisplayTime(){
        
        ChangeFormat();
        return super.DisplayTime()+" "+midday;
    }

    
}
