package HomeActivity2;

public class L6HA2Runner {
     public static void main(String[] args) {
       
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter obj4 = new ObjectCounter();
        System.out.println("Number of Objects Found: " + ObjectCounter.getObj());
        ObjectCounter.delete(obj1);
        System.out.println("Number of Objects Found: " + ObjectCounter.getObj());
    }
}
