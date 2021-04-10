
package HomeActivity_2;

import HomeActivity_1.Address;
import HomeActivity_1.Person;



public class L7HA2Runner{
    public static void main(String args[]){
        Address a1 = new Address(12,122,"Mirpur",10250);
        Address a2 = new Address(3,40,"Islamabad",1450);
        Person p1 = new Person("Mujtaba",20,a1);
        Book b1 = new Book(p1, "HP", "JK Rowlings");
        b1.author.SetAddress(a2);
        b1.display();
    }
}
