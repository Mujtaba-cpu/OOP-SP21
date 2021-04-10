
package HomeActivity_1;

public class L7HA1Runner {
    public static void main (String args[]){
        Address a1 = new Address(12,122,"Mirpur",10250);
        Person p1 = new Person("Mujtaba",20,a1);
        p1.display();
    }
}
