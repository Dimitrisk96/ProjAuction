
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
    int project_id;
    
    public RatingEtoF(int rating_q, int rating_c, int rating_cc, int rating_com, String username_freelancer, String username_employer, Date date, Time hour, String comment, int project_id)
    {
        this.rating_q = rating_q;
        this.rating_c = rating_c;
        this.rating_cc = rating_cc;
        this.rating_com = rating_com;
        this.username_freelancer = username_freelancer;
        this.username_employer = username_employer;
        this.date = date;
        this.hour = hour;
        this.avg_rating = (this.rating_q + this.rating_c+this.rating_cc+this.rating_com)/4;
        
        this.project_id = project_id;
    }
    
    //Get functions
    
    int get_rating_q()
    {
        return rating_q;
    }
    
    int get_rating_c()
    {
        return rating_c;
    }
    
    int get_project_id()
            
    {
        
        return project_id;
    }
    
    int get_rating_cc()
    {
        return rating_cc;
    }
    
    int get_rating_com()
    {
        return rating_com;
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
    
    //Set functions
    
    void set_rating_q(int rating_q)
    {
        this.rating_q = rating_q;
    }
    
    void set_rating_c(int rating_c)
    {
        this.rating_c = rating_c;
    }
    
    void set_rating_cc(int rating_cc)
    {
        this.rating_cc = rating_cc;
    }
    
    void set_rating_com(int rating_com)
    {
        this.rating_com = rating_com;
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