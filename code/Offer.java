import java.sql.Date;

public class Offer {
    
    private String username_freelancer;
        
    private int project_request_id;
    
    private int bid;
    
    private Date date;
    
    private String status;
    
    
    
    public Offer(String username_freelancer, int project_request_id, int bid, Date date, String status)
    
    {
       this.username_freelancer = username_freelancer;
        
       this.project_request_id = project_request_id;
    
       this.bid = bid;
    
       this.date = date;
    
       this.status = status;
}
    String get_String username_freelancer()
            
    {
        return username_freelancer;
    }
    
    int get_project_request_id()
            
    {
        return project_request_id;
        
    }
    
    int get_bid()
            
    {
        return bid;
    }
    
    Date get_date()
            
    {
        return date;
    }
    
    String get_status()
            
    {
        
        return status;
    }

     void set_username_freelancer(String username_freelancer)
            
    {
        this.username_freelancer = username_freelancer;
    }
    void set_project_request_id(int project_request_id)
            
    {
        this.project_request_id = project_request_id;
    }
    void set_bid(int bid)
            
    {
        this.bid= bid;
    }
    void set_date(Date date)
            
    {
        this.date = date;
    }
    void set_status(String status)
            
    {
        this.status= status;
    }

}