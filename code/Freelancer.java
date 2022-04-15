
import java.util.Date;


public class Freelancer {
    
    private String username;
    
    private String name;
    
    private String surname;
    
    private String password;
    
    private String email;
    
    private int phone;
    
    private Date birthdate;
    
    private String description;
    
    private String cv;
    
    private String ko;
    
    
    public Freelancer(String username, String name, String surname, String password, String email, int phone, Date birthdate, String description, String cv, String ko)
    
    {
        this.username = username;
        
        this.name = name;
        
        this.surname = surname;
        
        this.password = password;
        
        this.email = email;
        
        this.phone = phone;
        
        this.birthdate = birthdate;
        
        this.description = description;
        
        this.cv = cv;
        
        this.ko = ko;
    }
}
