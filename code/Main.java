import java.util.*;

public class Main 
        


{
    
    public static ArrayList<Admin> admins = new ArrayList<Admin>();
    
    
    public static ArrayList<Employer> employers = new ArrayList<Employer>();

    public static ArrayList<Enstasi> enstaseis = new ArrayList<Enstasi>();

    public static ArrayList<Feedback> feedbacks = new ArrayList<Feedback>();
    
    public static ArrayList<Freelancer> freelancers = new ArrayList<Freelancer>();

    public  static ArrayList<Offer> offers = new ArrayList<Offer>();
   
    public static ArrayList<Paradoteo> paradotea = new ArrayList<Paradoteo>();
    
    public static ArrayList<Payment> payments = new ArrayList<Payment>();
    
    public  static ArrayList<Project> projects = new ArrayList<Project>();
    
    public static ArrayList<ProjectRequest> project_requests = new ArrayList<ProjectRequest>();
    
    public static ArrayList<RatingEtoF> ratings_from_employers = new ArrayList<RatingEtoF>();

    public static ArrayList<RatingFtoE> ratings_from_freelancers = new ArrayList<RatingFtoE>();

    


    


    
    public static void main(String[] args)
            
            
            
    {
        
        
    }
    
    static Employer get_employer_by_username(String username)
            
    {
        Employer result = null;
        
        for (Employer e:Main.employers)
        {
            
            if(e.get_username().equals(username))
                
            {
                result = e;
                
                
            }
            
        }
        
        return result;
    }
    
    
      static Freelancer get_freelancer_by_username(String username)
            
    {
        Freelancer result = null;
        
        for (Freelancer f:Main.freelancers)
        {
            
            if(f.get_username().equals(username))
                
            {
                result = f;
                
                
            }
            
        }
        
        return result;
    }
    
}