/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

public class PhoneBook {
    
    private int contactCount=0;
    public final int DEFAULT_CAPACITY = 20;
    public int cap = DEFAULT_CAPACITY;
    private Contact[] contacts = new Contact[cap];
    public PhoneBook(){
        
    }
    public PhoneBook(int capacity){
        cap = capacity;
    }
    public boolean  insertContact(String name, int countryCode, int cityCode, String mobileNum, String mobileNumType){
       
       if (contactCount<=cap){
        contacts[contactCount] = new Contact( name, countryCode, cityCode,  mobileNum,  mobileNumType);
        
        
        contactCount++;
        return true;
       }else{
           return false;
       }
       
        
    }
   public boolean deleteContact(String name){

    
        for (int i = 0; i < contacts.length; i++) {
             if (contacts[i] != null && contacts[i].getName().equals(name)){
                 contacts[i] = null;
                 return true;
                            }

        }
        return false;
   }
    
    public  boolean GetContact(String name){
       for (int i = 0; i < contacts.length; i++) {
             if (contacts[i] != null &&contacts[i].getName().equals(name)){
                return true;
            }
            
        }
        return false;
    }
    
}
      
    

    
   
    

