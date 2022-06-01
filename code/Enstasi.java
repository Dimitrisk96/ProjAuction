import java.sql.Time;
import java.util.Date;


public class Enstasi {
    private String username_employer;
    private String username_admin;
    private int project_id;
    private String comment;
    private Date date;
    private Time time;
    private String status; 
    
  public Enstasi(String username_employer,String username_admin ,int project_id ,String comment,Date date,Time time,String status)
    {
    
    this.username_employer=username_employer;
    this.username_admin=username_admin;
    this.project_id=project_id;
    this.comment=comment;
    this.date=date;
    this.time=time;
    this.status=status;
    }  
    
     String get_username_employer()
            
    {
        return username_employer;
    }
    
    String get_username_admin()
            
    {
        return username_admin;
        
    }
    
    int get_project_id()
            
    {
        return project_id;
    }
    
    String get_comment()
            
    {
        return comment;
    }
    
    Date get_date()
            
    {
        
        return date;
    }
Time get_time()
            
    {
        return time;
    }
    
    String get_status()
            
    {
        
        return status;
    }

    void set_username_employer(String username_employer)
            
    {
        this.username_employer = username_employer;
    }
    void set_username_admin(String username_admin)
            
    {
        this.username_admin = username_admin;
    }
    void set_project_id(int project_id)
            
    {
        this.project_id = project_id;
    }
    void set_comment(String comment)
            
    {
        this.comment = comment;
    }
    void set_date(Date date)
            
    {
        this.date = date;
    }
    void set_time(Time time)
            
    {
        this.time = time;
    }
    void set_status(String status)
            
    {
        this.status = status;
    }
}

 

    
  