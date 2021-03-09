/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity_3;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class StudentRunner {
    public static void main(String[] args){
    int[] mark1={40,80,20,10,60};
        Student s1=new Student("Ali",mark1);
        int avg1=s1.Average();
        
        int[] mark2={40,60,30,90,40};
        Student s2=new Student("Mujtaba",mark2);
        int avg2=s2.Average();
        s1.display();
        s2.display();
        if(avg1>avg2){
             System.out.println("Student1 has greater average. "+avg1);
         }
         else{
             System.out.println("Student2 has greater average. "+avg2);
         }
        
    }
}
