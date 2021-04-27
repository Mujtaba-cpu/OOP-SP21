
package HomeActivity_2;

public class VerifiedSimple extends Simple{
    protected double x; 

    VerifiedSimple(int i, int i1) {
       super(i,i1);
    }
    
    
    
    public double add(){
        if (num1>0 && num2>0){
            x = num1+num2;
        }else{
            System.out.println("Error");
            System.exit(0);
        }
        return x;
    }
    
    public double sub(){
        if (num1>0 && num2>0){
            x = num1-num2;
        }else{
            System.out.println("Error");
            System.exit(0);
        }
        return x;
    }
    public double mul(){
        if (num1>0 && num2>0){
            x = num1*num2;
        }else{
            System.out.println("Error");
            System.exit(0);
        }
        return x;
    }
    public double div(){
        if (num1>0 && num2>0){
            x = num1/num2;
        }else{
            System.out.println("Error");
            System.exit(0);
        }
        return x;
    }
}
