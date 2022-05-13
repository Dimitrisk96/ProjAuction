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
}}