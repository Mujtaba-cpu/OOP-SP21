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
public class Book {
    private String author;
    private String[] chapterNames = new String[100]; 
    
    public Book(){
        author="";
        chapterNames[1]="";
    }
    
    public void set(String a, String[] cn){
        
        author = a;
        chapterNames = cn;
        
    }
    
    public Book(String a, String[] b ){
        author = a;
        chapterNames =b;
    }
    
    
    
    public static void CompareBook(Book a, Book b){
        if ( a.author ==  b.author){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
    public static void compareChapterNames(Book a, Book b){
        int length_a = a.chapterNames. length;
        int length_b = b.chapterNames. length;
        if (length_a > length_b){
            System.out.println("The book with more chapers is written by: "+a.author);
        }else{
            System.out.println("The book with more chapers is written by: "+b.author);
        }
        
    }
}
