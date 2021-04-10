
package HomeActivity_1;

public class Address {
    private int streetno;
    private int code;
    private int houseno;
    private String city;
    
    public Address(){
        
    }
    
    public Address(int sn, int hn, String c, int cc){
       streetno = sn;
        houseno=hn;
        city = c;
        code = cc;
    }
    
    public void setStreetNo(int s){
        streetno=s;
    }
    public void setCode(int c){
        code=c;
    }
    public void setHouseNo(int h){
        houseno=h;
    }
    public void setCity(String c){
        city=c;
    }
    
    public int getStreetNo(){
        return streetno;
    }
    public int getHouseNo(){
        return houseno;
    }
    public int getCode(){
        return code;
    }
    public String getCity(){
        return city;
    }
    
    public void display(){
        System.out.println("The Address is: \n Street Numer: "+ streetno +"\n House Number: "+houseno+"\n City: "+city+"\n Post Code:" + code);
    }
}
