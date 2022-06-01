import java.sql.Time;
import java.util.Date;

public class Payment {

    private String username_freelancer;
    private String username_employer;
    private int project_id;
    private int ammount;
    private Date date;
    private Time hour;

    public Payment(String username_employer, String username_freelancer, int project_id, int ammount, Date date, Time hour)
    {
        this.username_freelancer = username_freelancer;
        this.username_employer = username_employer;
        this.project_id=project_id;
        this.ammount = ammount;
        this.date = date;
        this.hour = hour;
    }
    
    String get_username_freelancer(){
    return username_freelancer;
    }
    
    String get_username_employer(){
    return username_employer;
    }
    
    int get_project_id(){
    return project_id;
    }
    
    int get_ammount(){
    return ammount;
    }
    
    Date get_date(){
    return date;
    }
    
    Time get_hour(){
    return hour;
    }
    
    void set_username_freelancer(String username_freelancer){
    this.username_freelancer = username_freelancer;
    }
    
     void set_username_employer(String username_employer){
    this.username_employer = username_employer;
    }
     
      void set_project_id(int project_id){
    this.project_id = project_id;
    }
      
      void set_ammount(int ammount){
    this.ammount = ammount;
    }
      
      void set_date(Date date){
    this.date = date;
    }
      
       void set_hour(Time hour){
    this.hour = hour;
    }
      
      
}