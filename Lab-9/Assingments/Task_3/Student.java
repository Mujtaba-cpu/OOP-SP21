
package Assingments.Task_3;

abstract class Student {
    protected String name;
    protected int age;
    protected int rollNumber;

    public Student(String n,int a, int rn){
        this.name = n;
        this.age = a;
        this.rollNumber = rn;
    }

    void display(){
        System.out.print("Student: "+name+"\nRoll Number: "+rollNumber+"\nAge: "+age);
    }

    abstract void takeExam();
}

