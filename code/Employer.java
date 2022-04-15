
import java.util.Date;


public class Employer {
    
    private String username;
    
    private String name;
    
    private String surname;
    
    private String password;
    
    private String email;
    
    private int phone;
    
    private Date birthdate;
    
    private String description;
    
    
    public Employer(String username, String name, String surname, String password, String email,int phone, Date birthdate, String description)
    
    {
        this.username = username;
        
        this.name = name;
        
        this.surname = surname;
        
        this.password = password;
        
        this.email = email;
        
        this.phone = phone;
        
        this.birthdate = birthdate;
        
        this.description = description;
          
    }
}
