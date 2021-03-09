/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity_3;

/**
 *
 * @author BOSS
 */
public class Student {
   private String Name ;
   private int[] array = new int[5];
  private int sum=0, avg=0;
  
  
   public Student(String n,int a[]){
       Name = n;
       for (int i =0;i<5; i++){
           array[i]=a[i];
       }
   }
   public int Average(){
    for (int i =0;i<5; i++){
        sum = sum + array[i];
    }
    avg = sum/5;
    return avg;
   }
   public void sssdisplay(){
       System.out.println(Name);
       for (int i =0;i<5; i++){
                 System.out.println(array[i]);

       }
   }
   
   
}
