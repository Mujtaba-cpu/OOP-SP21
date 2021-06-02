package Lab_12;

import java.util.Scanner;

public class Student extends Person implements Association {
    private int rollNo;
    private int semester;
    
    public Student(String name, String id){
        super(name,id);
        associate();
    }
public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    @Override
    public String toString() {
        return super.toString()+" ,Roll Number: "+getRollNo()+" ,Semester: "+getSemester();
    }

    @Override
    public void associate(){
        System.out.println("Enter Student's Details");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll #: ");
        this.setRollNo(scanner.nextInt());
        System.out.println("Enter semester: ");
        this.setSemester(scanner.nextInt());
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Student){
            Student obj=(Student)o;
            if(obj.getName().equals(super.getName()) && obj.getId().equals(super.getId()) && obj.rollNo==this.rollNo&&obj.semester==this.semester){
                return true;
            }
        }
        return false;
    }

    
}

