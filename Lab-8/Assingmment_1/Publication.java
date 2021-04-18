
package Assingmment_1;

public class Publication {
    
    protected String title;
    protected int price;
    
    public Publication(String title, int rate) {
        this.title = title;
        this.price = rate;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setPrice(int p) {
        this.price = p;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String display() {
        return "Title: " + title + "\nPrice:" + price;
    }
}

