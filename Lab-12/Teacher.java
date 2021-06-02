package Lab_12;

import java.util.Scanner;
public class Teacher extends Person implements Association {
    private String designation;
    private String department;

    public Teacher(String name, String id){
        super(name,id);
        associate();
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+" ,Designation: "+getDesignation()+" ,Department: "+getDepartment();
    }
    @Override
    public void associate(){
        System.out.println("Enter Teacher's Details");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Designation: ");
        this.setDesignation(scanner.next());
        System.out.println("Enter Department: ");
        this.setDepartment(scanner.next());
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Teacher){
            Teacher obj=(Teacher)o;
            if(obj.getName().equals(super.getName()) && obj.getId().equals(super.getId()) && obj.designation.equals(this.designation)&&obj.department.equals(this.department)){
                return true;
            }
        }
        return false;
    }
}

