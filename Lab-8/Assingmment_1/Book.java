
package Assingmment_1;

public class Book extends Publication{
    
    protected int pageCount;


    public Book(String title, int price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
        
    }
    
    public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }
    
    public int getPageCount() {
        return pageCount;
    }

    public String display() {
        return "Details Regarding Your Book"+ "\n"+ super.display() + "\nNumber of Pages is: " + pageCount;
    }
}