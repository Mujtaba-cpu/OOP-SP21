package Assingments.Task_2;

public class L9Task2Runner{
   public static void main(String args[]){
        int count;
        CustomStringTokenizer st = new CustomStringTokenizer("this is a test 1 abc dhf 42sd");
        count = st.countTokens();
       
        System.out.println("Tokens are:"+count);
    }
}
