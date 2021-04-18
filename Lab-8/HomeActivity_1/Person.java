package HomeActivity_1;

public class Person {
    protected String name;
    protected String address;
    protected String phoneNum;
    protected String emailAddress;
    
    public Person(String name, String address, String phone, String mail){
        this.name = name;
        this.address = address;
        this.phoneNum = phone;
        this.emailAddress = mail;
    }
    public void display(){
        System.out.println("Name: "+name+"\nAddress: "+address+"\nPhone Number: "+phoneNum+"\nEmail Address: "+emailAddress);
    }
}
