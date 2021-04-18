
package Assingment_2;

public class Laptop extends Computer {
    
    protected double length;
    protected double width;
    protected double height;
    protected double weight;

    public Laptop() {
        length = 0;
        width = 0;
        height = 0;
        weight = 0;
    }

    public Laptop(int wordSize, int memorySize, int storageSize, double speed,double length, double width, double height, double weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    
    
    public String display() {
        return super.display() + "\nLength: " + length + "\nWidth:" + width + "\nHeight:" + height + "\nWeight:" + weight;
    }
    
    
}
