import java.nio.file.Files;
import java.sql.Time;
import java.util.Date;


public class ProjectRequest {
    
    private int id;
    private String title;
    private String description;
    private Files accomp_files;
    private Date final_deadline;
    private int maximum_bid;
    private Date start_date;
    private Date end_date;
    private String username_employer;
    
    private Date first_deadline;
    
    
    
    public ProjectRequest(int id, String title, String description,Files accomp_files,Date final_deadline,int maximum_bid,Date start_date,Date end_date,String username_employer, Date first_deadline)
    {
    
    this.id=id;
    this.title=title;
    this.description=description;
    this.accomp_files=accomp_files;
    this.final_deadline=final_deadline;
    this.maximum_bid=maximum_bid;
    this.start_date=start_date;
    this.end_date=end_date;
    
    this.username_employer = username_employer;
    
    this.first_deadline = first_deadline;
    
    
    
    
    }
    
    int get_id()
            {
                return id;
            }
    
    String get_username_employer()
            
    {
        
        return this.username_employer;
    }
    
    Date get_first_deadline()
            
    {
        
        return this.first_deadline;
    }
           
     String get_title()
     {
         return title;
     }
                     
     String get_description()
     {
         return description;
     }
                            
     Files get_accomp_files()
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
                            
     void set_accomp_files(Files accomp_files)
             {
                this.accomp_files=accomp_files;
             }
             
             
      void set_final_deadline(Date final_deadline)
              {
                  
                  this.final_deadline=final_deadline;
              }   
      
      void set_first_deadline(Date first_deadline)
              
      {
          
          this.first_deadline = first_deadline;
      }
              
      void set_maximum_bid(int maximum_bid)
              {
                  this.maximum_bid=maximum_bid;
              }
                      
              
       void set_start_date(Date start_date)
       {
           this.start_date=start_date;
       }
                              
       
       void set_end_date(Date end_date)
       {
           this.end_date=end_date;
           
       }
       
       
        
    
}