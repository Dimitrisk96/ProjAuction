
import java.sql.Time;
import java.util.Date;


public class RatingEtoF {
    
    private int rating_q;
    
    private int rating_c;
    
    private int rating_cc;
    
    private int rating_com;
    
    private String username_freelancer;
    
    private String username_employer;
    
    private float avg_rating;
    
    private Date date;
    
    private Time hour;
    
    private String comment;
    
    public RatingEtoF(int rating_q, int rating_c, int rating_cc, int rating_com, String username_freelancer, String username_employer, Date date, Time hour, String comment)
            
    {
        this.rating_q = rating_q;
        
        this.rating_c = rating_c;
        
        this.rating_cc = rating_cc;
        
        this.rating_com = rating_com;
        
        this.username_freelancer = username_freelancer;
        
        this.username_employer = username_employer;
        
        this.date = date;
        
        this.hour = hour;
        
        this.comment = comment;
        
        this.avg_rating = (this.rating_q + this.rating_c+this.rating_cc+this.rating_com)/4;
    }
}
