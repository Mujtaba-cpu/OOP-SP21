
package Assingmment_1;
import java.util.Scanner;
public class L8Assingment1Runner {   
    
    public static void main(String[] args) {
        
        int playTime;
        int price;
        int pageCount;
        int choice;
        String title;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to our Publication Company");
        System.out.println("Press \n1. For the Book \n2. For the Tape \n0. To Exit \nEnter Choice: ");

        choice = in.nextInt();
        if (choice == 0){
            System.out.println("Thank you for coming!");
        }else if(choice ==1){
            System.out.println("Enter Book's Name: ");
                title = in.next();
                System.out.println("Enter Book's price: ");
                price = in.nextInt();
                System.out.println("Enter Total pages: ");
                pageCount = in.nextInt();
                System.out.println("--------------------------");
                Book b = new Book(title,price,pageCount);
                System.out.println(b.display());
                System.out.println("Thank you for coming!");
        }else if(choice ==2){
            System.out.println("Enter Tape's Name: ");
                title = in.next();
                System.out.println("Enter Tape's price: ");
                price = in.nextInt();
                System.out.println("Enter Total Duration of Tape in Minutes: ");
                playTime = in.nextInt();
                Tape t = new Tape(title,price,playTime);
                 System.out.println("--------------------------");
                System.out.println(t.display());
                System.out.println("Thank you for coming!");
        }  
    }
}
