import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;


public class Employer {
    
    private String username;
    
    private String name;
    
    private String surname;
    
    private String password;
    
    private String email;
    
    private int phone;
    
    private Date birthdate;
    
    private String description;
    
    private int balance;
    
    
    public Employer(String username, String name, String surname, String password, String email,int phone, Date birthdate, String description, int balance)
    
    {
        this.username = username;
        
        this.name = name;
        
        this.surname = surname;
        
        this.password = password;
        
        this.email = email;
        
        this.phone = phone;
        
        this.birthdate = birthdate;
        
        this.description = description;
        
        this.balance = balance;
          
    }
    String get_username()
    {
        return username;
    }
     
    String get_name()
      {
          return name;
      }
    
    int get_balance()
            
    {
        return balance;
        
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
    void set_balane(int balance)
    {
        this.balance = balance;
        
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
    
    void login(String username, String password)
            
    {
     
        boolean found = false;
        
        
        if(username.equals(null))
            
        {
            
            return;
        }
        
        if(password.equals(null))
            
        {
            
            return;
        }
        
        
        for(Employer emp: Main.employers)
            
        {
            if (emp.get_username().equals(username) && emp.get_password().equals(password))
                
            {
                found = true;
                
            }
        }
        
        if(found ==true)
            
        {
            //tha mpei kodikas pou na ton odgei sto homepage tou Employer
            
        }
        
        
    }
    
    void register(String onoma, String eponimo, String username, String email, String password1,String password2, int phone_number, Date imer, String description, int balance)
            
    {
        boolean success = true;
        
        Date current = new Date(); 
         
         
      OffsetDateTime startOdt = imer.toInstant().atOffset(ZoneOffset.UTC);
      OffsetDateTime endOdt = current.toInstant().atOffset(ZoneOffset.UTC);
   
         
     int ilikia = Period.between(startOdt.toLocalDate(), endOdt.toLocalDate()).getYears();
     
     if(ilikia< 18)
         
     {
         //tha emfanistei i antistoixi selida kai 
         
         //
         
         return;
         
     }
     
     if(!password1.equals(password2))
         
     {
         //tha emfanizetai i selida
         
         
         return;
         
     }
     
     if(password1.length()<8)
         
     {
         
         //tha emfanizetai i selida 
         
         return;
         
     }
     
     if(email.equals(null))
     {
         
         //tha emfanizetai i antistoixi selida
         
         return;
         
     }
     
     if(username.equals(null))
         
     {
         //tha emanizetai i antistoixi selida
         
         return;
         
     }

        
        
        
        for(Employer emp: Main.employers)
            
        {
            if(emp.get_username().equals(username))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
            
            if(emp.get_email().equals(email))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
            
            
            
            
        }
        
        if(success==true)
            
        {
            Employer e1 = new Employer(username,onoma,eponimo,password1,email,phone_number,imer,description, balance);

            Main.employers.add(e1);
            
        }
        
        
    }
    
    void delete_account()
            
    {
        
        for(Employer emp: Main.employers)
            
        {
            if (emp.get_username().equals(this.get_username()))
                
            {
                Main.employers.remove(emp);
                
                break;
                
            }
            
        }
        
        
    }
    
    
    void edit_info(String onoma, String eponimo, String username, String email, String password1,String password2, int phone_number, Date imer, String decription, int balance)
    
    {
        boolean success = true;
        
        for(Employer emp: Main.employers)
            
        {
            if(emp.get_username().equals(this.get_username()))
                
            {
                
                Date current = new Date(); 
         
         
                OffsetDateTime startOdt = imer.toInstant().atOffset(ZoneOffset.UTC);
                OffsetDateTime endOdt = current.toInstant().atOffset(ZoneOffset.UTC);
   
         
                int ilikia = Period.between(startOdt.toLocalDate(), endOdt.toLocalDate()).getYears();
     
                if(ilikia< 18)
         
                    {
         //tha emfanistei i antistoixi selida kai 
         
         //
         
                return;
         
                     }
     
                if(!password1.equals(password2))
         
                {
         //tha emfanizetai i selida
         
         
                    return;
         
                }
     
                if(password1.length()<8)
         
                    {
         
         //tha emfanizetai i selida 
         
                    return;
         
                    }
     
                if(email.equals(null))
                    {
         
         //tha emfanizetai i antistoixi selida
         
                        return;
         
                     }
     
                if(username.equals(null))
         
                   {
         //tha emanizetai i antistoixi selida
         
                        return;
         
                   }
                
        for(Employer emp2: Main.employers)
            
        {
            if(emp2.get_username().equals(username))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
            
            if(emp.get_email().equals(email))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
        }
                
             
            if(success==true)
            
            {
                emp.set_username(username);
                
                emp.set_password(password1);
                
                emp.set_phone(phone_number);
                
                emp.set_email(email);
                
                emp.set_balane(balance);
                
                emp.set_name(onoma);
                
                emp.set_surname(eponimo);
                
                emp.set_birthdate(imer);
                
                emp.set_description(description);
            
            
              }
        
                
            }
            
          
            
        }
        
      
        
    }
}