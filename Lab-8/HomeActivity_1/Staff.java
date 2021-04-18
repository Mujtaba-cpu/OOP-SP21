
package HomeActivity_1;

import java.util.Date;

public class Staff extends Employee{
    protected String  title;
    
    public Staff(String name, String address, String phone, String mail,String off, int sal, Date d, String title){
        super(name,address,phone,mail,off,sal,d);
        this.title=title;
    }
    public void display(){
        super.display();
        System.out.println("Title is: " + title);
    }
}
