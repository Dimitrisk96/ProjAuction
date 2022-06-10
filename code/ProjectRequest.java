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
    
    int get_id()
            {
                return id;
            }
            
           
     String get_title()
     {
         return title;
     }
                     
     String get_description()
     {
         return description;
     }
                            
     String get_accomp_files()
             {
                 return accomp_files;
             }
             
             
      Date get_final_deadline()
              {
                  
                  return final_deadline;
              }      
              int get_maximum_bid()
              {
                  return maximum_bid;
              }
                      
              
       Date get_start_date()
       {
           return start_date;
       }
                              
       
       Date get_end_date()
       {
           return end_date;
           
       }
   
       
      
       
       
       void set_id(int id)
            {
                this.id=id;
            }
            
           
     void set_title(String title)
     {
         this.title=title;
     }
                     
     void set_description(String description)
     {
         this.description=description;
     }
                            
     void set_accomp_files(String accomp_files)
             {
                this.accomp_files=accomp_files;
             }
             
             
      void set_final_deadline(Date final_deadline)
              {
                  
                  this.final_deadline=final_deadline;
              }      
              
      void set_maximum_bid(int maximum_bid)
              {
                  this.maximum_bid=maximum_bid;
              }
                      
              
       void set_start_date(Date start_date)
       {
           this.start_date=start_date;
       }
                              
       
       void get_end_date(Date end_date)
       {
           this.end_date=end_date;
           
       }
       
       
        
    
}