
package HomeActivity_1;

import java.util.Date;

public class Faculty extends Employee{
    protected int officeHours;
    protected String  rank;
    
    public Faculty(String name, String address, String phone, String mail,String off, int sal, Date d, int offHours, String rank){
        super(name,address,phone,mail,off,sal,d);
        this.officeHours=offHours;
        this.rank=rank;
    }
    public void display(){
        super.display();
        System.out.println("Office hours: " + officeHours + " Rank: " +rank );
    }
}
