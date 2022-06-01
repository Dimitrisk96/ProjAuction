public class Admin {
    private String username;
    
    private String password;
    
    private String email;
    
    private String name;
    
    private String surname;
    
    private String ko;
    
    
    public Admin(String username, String password, String email, String name, String surname, String ko)
            
    {
        this.username = username;
        
        this.password = password;
        
        this.email = email;
        
        this.name = name;
        
        this.surname = surname;
        
        this.ko = ko;
    }
    
    
    String get_username()
            
    {
        return username;
    }
    
    String get_password()
            
    {
        return password;
        
    }
    
    String get_email()
            
    {
        return email;
    }
    
    String get_name()
            
    {
        return name;
    }
    
    String get_surname()
            
    {
        
        return surname;
    }
    
    String get_ko()
            
    {
        
        return ko;
    }
    
    void set_username(String username){
    this.username = username;
    }
    
     void set_password(String password){
    this.password = password;
    }
     
      void set_email(String email){
    this.email = email;
    }
      
       void set_name(String name){
    this.name = name;
    }
       
        void set_surname(String surname){
    this.surname = surname;
    }
        
         void set_ko(String ko){
    this.ko = ko;
    }
    
}