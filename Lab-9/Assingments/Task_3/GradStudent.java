package Assingments.Task_3;

public class GradStudent extends Student{
    public GradStudent(String n,int a, int rn){
        super(n,a,rn);
    }

    public void takeExam(){
        System.out.println("You Need to Give a Written Exam");
    }
}
