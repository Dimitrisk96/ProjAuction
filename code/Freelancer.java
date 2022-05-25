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
    
    //Get functions
    
    String get_username()
    {
        return username;
    }
    
    String get_name()     
    {
        return name;
    }
    
    String get_surname()
    {
        return surname;
    }
    
    String get_password()
    {
        return password;
        
    }
    
    String get_email()      
    {
        return email;
    }

    String get_ko()      
    {
        return ko;
    }
    
    //Set funcions
    
    void set_username(String username)
    {
        this.username = username;
    }
    
    void set_name(String name)
    {
        this.name = name;
    }
    
    void set_surname(String aurname)
    {
        this.surname = surname;
    }
    
    void set_password(String password)
    {
        this.password = password;
    }
    
    void set_email(String email)
    {
        this.email = email;
    }
    
    void set_phone(int phone)
    {
        this.phone = phone;
    }
    
    void set_birthate(Date birthdate)
    {
        this.birthdate = birthdate;
    }
    
    void set_description(String description)
    {
        this.description = description;
    }
    
    void set_ko(String ko)
    {
        this.ko = ko;
    }
}

    void delete_account()
    {
        for(Freelancer fl: Main.freelancers)
        {
            if(fl.get_username().equals(this.get_username()))  
            {
                Main.freelancers.remove(fl);
                
                break;
            }
        }
    }