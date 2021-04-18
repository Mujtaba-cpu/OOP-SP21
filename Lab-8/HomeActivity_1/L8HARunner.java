
package HomeActivity_1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class L8HARunner {
    public static void main(String args[]){
        Person p = new Person("Mujtaba","A-40","8345","myre@546");
        Student s = new Student("Mujtaba","A-40","8345","myre@546","GAS");
        Calendar myCalendar = new GregorianCalendar(2018, 2, 11);
        Date d1 = myCalendar.getTime();
              
        Employee e = new Employee("Mujtaba","A-40","8345","myre@546","A",5600,d1);
        
        s.display();
        e.display();
    }
}
