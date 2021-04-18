
package Assingment_2;

public class Computer {
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected double speed;

    public Computer() {
        wordSize = 0;
        memorySize = 0;
        storageSize = 0;
        speed = 0;
    }

    public Computer(int wordSize, int memorySize, int storageSize, double speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

   

    
    public String display() {
        return "Word Size: " + wordSize +" bits"+ "\nMemory Size: " + memorySize +" Mb"+ "\nStorage Size: " + storageSize +" Mb"+ "\nSpeed: " + speed+" Ghz";
                
    }
    
    
    
    
    
}
