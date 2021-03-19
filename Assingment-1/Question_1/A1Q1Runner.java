/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;


public class A1Q1Runner {
    public static void main(String args[]){
        Contact c = new   Contact("Mujtaba", 92, 10250, "3490895167","Mobile");
        c.printContact();
        PhoneBook p1 = new   PhoneBook();
        p1.insertContact("zargham", 92, 10250, "5689", "mobile");
        p1.insertContact("Mujtaba", 92, 10250, "3490895167","Mobile");
        p1.insertContact("Ahmed", 92, 10250, "3490","Mobile");
        p1.insertContact("Shuja", 92, 10250, "3490546167","Mobile");
        System.out.println(p1.GetContact("Mujtaba"));
        System.out.println(p1.GetContact("Zargh"));
        System.out.println(p1.deleteContact("Shuja"));
        System.out.println(p1.deleteContact("Shuja"));
        System.out.println(p1.GetContact("zargham"));
    }    
    
}
