/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;


public class Bus {
    
    private Seat[] seats = new Seat[14];
    private int total=14;
    private int seatcount=0;
    private int vs = total-seatcount; 
    
    
    public Bus(){
        seats[13] = new Seat();
    }
    public Bus(int numberOfSeats){
        total = numberOfSeats;
        seats[numberOfSeats] = new Seat();
    }
    
    public boolean bookSeat(String passengerName){
        if (seatcount<= total){
            seats[seatcount] = new Seat();
            seats[seatcount].bookSeat(passengerName, seatcount);
            seatcount++;
            vs--;
            return true;
        }
        return false;
    }
    
    public boolean bookSeat(String passengerName,String seatType){
        if (seatcount<= total){
            seats[seatcount] = new Seat();
            seats[seatcount].bookSeat(passengerName, seatcount);
            seats[seatcount].setSeatType(seatType);
            seatcount++;
            vs--;
            return true;
        }
        return false;
    }
    
    public boolean bookSeat(String[] passengerName, int seatCount){
        
        for(int i =0; i < seatCount; i++){
            
            if (seatcount<= total){
               seats[seatcount] = new Seat();
               seats[seatcount].bookSeat(passengerName[i], seatcount);
               seatcount++;
               vs--;
            }
            if (i == seatCount-1 ){
                
                return true;
            }
        }
        return false;
            
    }
    public boolean unBookSeat(String passangerName){
        return seats[seatcount].unBookSeat();
    }
    public int getVacantSeatCount(){
        return vs;
    }
    public void showBookings(){
        int x = total-vs;
        System.out.println("The total number of booking is: " + x );
        
        
     }

    
}
