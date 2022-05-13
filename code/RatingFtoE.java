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
    
    //Get Functions
    
    int get_rating_comm()
    {
        return rating_comm;
    }
    
    int get_rating_feed()
    {
        return rating_feed;
    }
    
    String get_username_freelancer()
    {
        return username_freelancer;
    }
    
    String get_username_employer()
    {
        return username_employer;
    }
    
    Date get_date()
    {
        return date;
    }
    
    Time get_hour()
    {
        return hour;
    }
    
    float get_avg_rating()
    {
        return avg_rating;
    }
    
    //Set Functions
    
    void set_rating_comm(int rating_comm)
    {
        this.rating_comm = rating_comm;
    }
    
    void set_rating_feed(int rating_feed)
    {
        this.rating_feed = rating_feed;
    }
    
    void set_username_freelancer(String username_freelancer)
    {
        this.username_freelancer = username_freelancer;
    }
    
    void set_username_employer(String username_employer)
    {
        this.username_employer = username_employer;
    }
    
    void set_comment(String comment)
    {
        this.comment = comment;
    }
}
