
package HomeActivity_1;

public class Student extends Person {
    protected String status;
    
    public Student(String name, String address, String phone, String mail, String status){
        super(name,address,phone,mail);
        this.status = status;
    }
    public void display(){
        super.display();
        System.out.println("Status: "+status);
    }
}
