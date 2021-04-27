package Assingments.Task_2;

import java.util.StringTokenizer;

public class CustomStringTokenizer extends StringTokenizer {
    protected String s;
    public CustomStringTokenizer(String str) {
        super(str);
        this.s=str;
    }
   
   public int countTokens(){
        int tt = super.countTokens();
       int count = tt;
        String token;
        for(int i = 0; i<tt; i++){
            token = super.nextToken();
            for(int j = 0; j<token.length(); j++){
                if(Character.isDigit(token.charAt(j))){
                    count--;
                    break;
                }
            }
        }
    
        return count;
    
    }
      
    }

