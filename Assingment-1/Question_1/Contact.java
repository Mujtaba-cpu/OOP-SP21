/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;


public class Contact {
    private String name;
    private String mobileNum;
    private String mobileNumType;
    private int cityCode, countryCode;
    
    
    
       
    public Contact(String name, int countryCode, int cityCode, String mobileNum, String mobileNumType){
        this.name = name;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.mobileNum = mobileNum;
        this.mobileNumType = mobileNumType;
    }
    
   
    
    public void SetMobileNumber(String mn){
        this.mobileNum  = mn;
    }
   
    public String getMobileNum(){
        return mobileNum;
    } 
    public String getName(){
        return name;
    } 
    public void printContact(){
        System.out.println("Name: "+ name+"\n"+"Country Code: " + countryCode +"\n"+ "City Code: " + cityCode +"\n"+ "Mobile Number: " + mobileNum +"\n"+"Number Type: "+  mobileNumType);
    }
    
}

