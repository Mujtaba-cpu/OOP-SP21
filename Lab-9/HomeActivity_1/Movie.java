package HomeActivity_1;

public class Movie {
    protected String rating;
    protected int idNumber;
    protected String title;
    protected double lateFee;
    public Movie(String r, int id,String t){
        this.rating = r;
        this.idNumber=id;
        this.title=t;
    }
    
    public void setRating(String r){
        this.rating=r;
    }
    public void setIdNumber(int id){
        this.idNumber=id;
    }
    
    public void setTitle(String t){
        this.title=t;
    }
    public String getRating(){
        return this.rating;
    }
    public int getIdNumber(){
        return this.idNumber;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public boolean equals(Movie m1){
        if (this.idNumber==m1.idNumber){
            return true;
        }
        return false;
    }
     public double calcLateFee(int nod){
         lateFee = nod*2;
         return lateFee;
     }
    
}

