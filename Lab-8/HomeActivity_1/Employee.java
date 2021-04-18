
package HomeActivity_1;
import java.util.Date;

public class Employee extends Person {
    protected String office;
    protected int salary;
    protected Date date ;
    
    public Employee(String name, String address, String phone, String mail,String off, int sal, Date d){
        super(name,address,phone,mail);
        this.office=off;
        this.salary=sal;
        this.date = d;
    }
    public void display(){
        super.display();
        System.out.println("Office: "+office+"\nSalary: "+salary+"\nDate Of Hire: "+date);
    }
        
}
