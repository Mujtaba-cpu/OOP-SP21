package HomeActivity_2;

public class Simple {
    protected double num1,num2;
    
    public Simple(){
        this.num1=0;
        this.num2=0;
    }
    public Simple(double n1,double n2){
        this.num1=n1;
        this.num2=n2;
    }
    
    public double add(){
        return num1+num2;
    }
    public double sub(){
        return num1-num2;
    }
    public double mul(){
        return num1*num2;
    }
    public double div(){
        return num1/num2;
    }
    
}
