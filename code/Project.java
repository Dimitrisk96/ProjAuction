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
    
    Date get_first_deadline()
            
    {
        return first_deadline;
    }
    
    int get_ammount_per_deadline()
            
    {
        
        return ammount_per_deadline;
    }
    
    Files get_files_per_deadline()
            
    {
        
        return files_per_deadline;
    }
    String get_status()
            
    {
        
        return status;
    }
    int get_paid_ammount()
            
    {
        
        return paid_ammount;
    }
    void set_username_freelancer(String username_freelancer)
            
    {
        this.username_freelancer= username_freelancer;
    }
    void set_username_employer(String username_employer)
            
    {
        this.username_employer = username_employer;
    }
    void set_username_admin(String username_admin)
            
    {
        this.username_admin = username_admin;
    }
    void set_first_deadline(Date first_deadline)
            
    {
        this.first_deadline = first_deadline;
    }
    void set_ammount_per_deadline(int ammount_per_deadline)
            
    {
        this.ammount_per_deadline= ammount_per_deadline;
    }
    void set_files_per_deadline(Files files_per_deadline)
            
    {
        this.files_per_deadline = files_per_deadline;
    }
    void set_paid_ammount(int paid_ammount)
            
    {
        this.paid_ammount = paid_ammount;
    }
    void set_status(String status)
            
    {
        this.status = status;
    }
}