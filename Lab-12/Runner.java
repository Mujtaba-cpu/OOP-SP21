
package Lab_12;


/*public class Runner { 
    public static void main(String[] args){
            HumanResource r1 = new HumanResource();
            r1.add(new Student("Mujtaba","079"));
            r1.add(new Teacher("Umair", "245"));

            System.out.println(r1);
    }
}*/
public class Runner {
    public static void main(String[] args) {
            HumanResource HR = new HumanResource();
            HR.add(new Student("Mujtaba","079"));
            HR.add(new Teacher("Umair", "245"));
            HR.add(new Teacher("Ali", "342"));
            System.out.println("-----For removal-----");
            System.out.println(HR.delete(new Teacher("Umair","245")));


            System.out.println(HR);
        }
}