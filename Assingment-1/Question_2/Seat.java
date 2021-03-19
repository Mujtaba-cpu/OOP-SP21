/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;


public class Seat {
     private String passangerName ;
     private String seatType ;
     private boolean BookingStatus ;
     private int seatNumber;
     
     public Seat(){
        this.passangerName="" ;
        this.seatType ="";
        this.BookingStatus=true;
        this.seatNumber=0;
     }
     
     public void setSeatType(String seatType){
         this.seatType = seatType;
     }
     
     public boolean bookSeat(String passangerName,int seatNumber){
         this.passangerName = passangerName;
         this.seatNumber = seatNumber;
         this.BookingStatus = true;
         if (BookingStatus == true){
             return true;
         }else{
             return false;
         }
     }
     
     public boolean unBookSeat(){
         this.BookingStatus = false;
         if (BookingStatus == true){
             return true;
         }else{
             return false;
         }
     }
     public boolean isBooked(){
         if (BookingStatus == true){
             return true;
         }else{
             return false;
         }
     }
}
