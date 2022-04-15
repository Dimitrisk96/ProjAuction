import java.sql.Time;
import java.util.Date;


public class ProjectRequest {
    
    private int id;
    private String title;
    private String description;
    private String accomp_files;
    private Date final_deadline;
    private int maximum_bid;
    private Date start_date;
    private Date end_date;
    
    
    
    public ProjectRequest(int id, String title, String description,String accomp_files,Date final_deadline,int maximum_bid,Date start_date,Date end_date)
    {
    
    this.id=id;
    this.title=title;
    this.description=description;
    this.accomp_files=accomp_files;
    this.final_deadline=final_deadline;
    this.maximum_bid=maximum_bid;
    this.start_date=start_date;
    this.end_date=end_date;
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}