/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity_2;





/**
 *
 * @author Maliks
 */
public class L5HA2Runner {
    public static void main(String args[]){
      Book b1 = new Book();
      Book b2 = new Book("Mujtaba", new String[] {"1","2","3","4","5","6","7"});
      Book b3 = new Book("Hamza", new String[] {"1","2","3","4"});
      b1.set("Hamza",new String[]{"1","2"} );
      Book.CompareBook(b1, b3);
      Book.compareChapterNames(b2, b3);
     
    }
}