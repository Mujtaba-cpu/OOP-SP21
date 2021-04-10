
package HomeActivity_2;

import HomeActivity_1.Person;

/**
Create a class Book that contains an author of type Person (Note: Use the Person class
created in the first exercise). Other data members are bookName and publisher. Modify the
address of the author in runner class.

 */
public class Book {
    public Person author;
    public String bookName;
    public String publisher;
    
    public Book(){
        
    }
    
    public Book(Person p, String bn, String pub){
        author = p;
        bookName =bn;
        publisher = pub;
    }
    
    public void setBookName(String s){
        bookName = s;
    }
    public void setPublisher(String p){
        publisher = p;
    }
    public void setAuthor(Person a){
        author =a;
    }
    
    public String getBookName(){
        return bookName;
    }
    public String getPublisher(){
        return publisher;
    }
    public Person getAuthor(){
        return author;
    }
    
    public void display(){
        author.display();
        System.out.println("Book name:"+ bookName);
        System.out.println("Publisher:"+ publisher);
    }
   
}
