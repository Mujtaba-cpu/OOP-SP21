
package Assingment;


public class HotdogRunner {
    public static void main(String[] args){
        Hotdog h1 = new Hotdog(101,0);
        Hotdog h2 = new Hotdog(102,0);
        Hotdog h3 = new Hotdog(103,0);
        h1.justSold();
        h1.display();
        h2.justSold();
        h2.display();
        h3.justSold();
        h3.justSold();
        h3.display();
    }
}
