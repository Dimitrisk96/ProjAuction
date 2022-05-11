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
                                             
    int get_phone()
    {
        return phone;
    }
                                                     
    Date get_birthdate()
    {
        return birthdate;
    }
                                                             
    String get_description()
    {
        return description;
    }
    
    
    
    
    
    
    
    
    
    
    
    void set_username(String username)
    {
        this.username=username;
    }
     
    void set_name(String name)
      {
        this.name=name;
      }
                     
    void set_surname(String surname)
    {
        this.surname=surname;
    }
                             
    void set_password(String password)
    {
        this.password=password;
    }
                                     
    void set_email(String email)
    {
        this.email=email;
    }
                                             
    void set_phone(int phone)
    {
        this.phone=phone;
    }
                                                     
    void set_birthdate(Date birthdate)
    {
        this.birthdate=birthdate;
    }
                                                             
    void set_description(String description)
    {
        this.description=description;
    }
    
}