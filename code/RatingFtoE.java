
import java.sql.Time;
import java.util.Date;


public class RatingFtoE {
    
    private int rating_comm;
    
    private int rating_feed;
    
    private String username_freelancer;
    
    private String username_employer;
    
    private float avg_rating;
    
    private Date date;
    
    private Time hour;
    
    private String comment;
    
    
    public RatingFtoE(int rating_comm, int rating_feed, String username_freelancer, String username_employer, float avg_rating, Date date, Time hour, String comment)
    
    {
        this.rating_comm = rating_comm;
        
        this.rating_feed = rating_feed;
        
        this.username_freelancer = username_freelancer;
        
        this.username_employer = username_employer;
        
        this.date = date;
        
        this.hour = hour;
        
        this.comment = comment;
        
        this.avg_rating = (this.rating_comm+this.rating_feed)/2;
        
    }
}
