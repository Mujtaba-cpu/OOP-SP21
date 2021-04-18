
package Assingmment_1;

public class Tape extends Publication {
    
    private int playTime;

    public Tape(String title, int price,int time) {
        super(title, price);
        this.playTime = time;
    }

    public void setPlayTimeMinutes(int playTimeMinutes) {
        this.playTime = playTimeMinutes;
    }

    public int getPlayTimeMinutes() {
        return playTime;
    }

    
    public String display() {
        return "Details Regarding Your Tape"+ "\n"+ super.display() + "\nTotal Play Time is: " + playTime + " min" ;
    }  
}
