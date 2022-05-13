import java.nio.file.Files;
import java.util.Date;

public class Project{
    
    private String username_freelancer;
    private String username_employer;
    private String username_admin;
    private Date first_deadline;
    private int ammount_per_deadline;
    private Files files_per_deadline;
    private String status;
    private int paid_ammount;
    


public Project(String username_freelancer, String username_employer, String username_admin, Date first_deadline, int ammount_per_deadline, Files files_per_deadline, String status, int paid_ammount)
{
    this.username_freelancer = username_freelancer;
    this.username_employer = username_employer;
    this.username_admin = username_admin;
    this.first_deadline = first_deadline;
    this.ammount_per_deadline = ammount_per_deadline;
    this.files_per_deadline = files_per_deadline;
    this.status = status;
    this.paid_ammount = paid_ammount;
}
String get_username_freelancer()
            
    {
        return username_freelancer;
    }
    
    String get_username_employer()
            
    {
        return username_employer;
        
    }
    
    String get_username_admin()
            
    {
        return username_admin;
    }
    
    String get_first_deadline()
            
    {
        return first_deadline;
    }
    
    String get_ammount_per_deadline()
            
    {
        
        return ammount_per_deadline;
    }
    
    String get_files_per_deadline()
            
    {
        
        return files_per_deadline;
    }
    String get_status()
            
    {
        
        return status;
    }
    String get_paid_ammount()
            
    {
        
        return paid_ammount;
    }
}