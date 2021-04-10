
package HomeActivity_1;

public class Person {
    private String name;
    private int age;
    private Address cAddress;
    
    public Person(){
        
    }
    
    public Person(String n,int a, Address ad){
        name = n;
        age = a;
        cAddress = ad;
    }
    
    public void setName(String s){
        name = s;
    }
    public void setAge(int a){
        age = a;
    }
    public void SetAddress(Address s){
        cAddress = s;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Address getAddress(){
        return cAddress;
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        cAddress.display();
    }
    
}
