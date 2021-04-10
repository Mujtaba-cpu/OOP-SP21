
package Activity_1;

public class L7A1Runner extends studentRecord {

public static void main(String args[]){
studentRecord s = new studentRecord("MBA");
employeeRecord e = new employeeRecord(111, 50000);
Manager m1 = new Manager("financeManager", 5000, e, s ) ;
m1.display();
}
}

 


