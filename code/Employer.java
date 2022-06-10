import java.nio.file.Files;
import java.sql.Time;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.ArrayList;


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
    
    ArrayList<Offer> get_offers(ProjectRequest p)
            
    {
        ArrayList<Offer> result = new ArrayList<Offer>();
        
        
        for(Offer o:Main.offers)
            
        {
            if(o.get_project_request_id()==p.get_id())
                
            {
                
                result.add(o);
                
            }
            
        }
        
        
        return result;
        
    }
    
    
    void assign_project(ProjectRequest p, Freelancer f)
            
    {
        for(Offer o:Main.offers)
            
        {
            if(o.get_project_request_id()==p.get_id() && o.get_username_freelancer().equals(f.get_username()))
                
            {
                o.set_status("accepted");
                
                        
            }
            
            else
                
            {
                o.set_status("rejected");
                
            }
            
        }
        
        
    }
    
   void upload_project_request(int id, String title, String description,Files accomp_files,Date final_deadline,int maximum_bid,Date start_date,Date end_date,String username_employer, Date first_deadline)         
   {
       
       if(final_deadline.before(new Date()))
               
               {
                //tha emfanizetai i selida   
                   
                   return;
               }
       
       if(start_date.before(new Date()))
           
       {
           
           //tha emfanizetai selida
       }
       
       if(end_date.before(new Date()))
           
       {
           
           //tha emfanizetai selida
           return;
       }
       
       
       if(title==null)
       {
           
           
           
           return;
       }
       
       if(accomp_files==null)
           
       {
           
           return;
       }
       
       if(final_deadline==null)
           
           
       {
           
           return;
       }
       
       if(maximum_bid==-1)
           
       {
           
           return;
       }
       
       ProjectRequest pr = new ProjectRequest(id,title, description,accomp_files,final_deadline,maximum_bid,start_date,end_date,username_employer,first_deadline);
       
       Main.project_requests.add(pr);
   }      
   
   
   void delete_project_request(ProjectRequest p)
           
   {
       for(ProjectRequest pr:Main.project_requests)
           
       {
           if(p.get_id()==pr.get_id())
               
           {
               Main.project_requests.remove(pr);
               
               break;
               
           }
           
       }
       
   }
   
   String get_balance_info()
           
   {
       return  " "+ balance + " ";
   }
   
   
  ArrayList<Project> get_active_projects()
          
  {
      ArrayList<Project> result = new ArrayList<Project> ();
      
      for(Project p:Main.projects)
          
      {
          if(p.get_last_deadline().after(new Date()) && p.get_username_employer().equals(this.username))
              
          {
              result.add(p);
              
          }
          
          
          
      }
      
      
      return result;
  }
  
  String get_project_info(Project p)
          
  {
      String result = "";
      
      for(Project pr:Main.projects)
          
      {
          if(pr.get_id()==p.get_id())
          
          {
              
              result = result+"First Deadline:"+pr.get_first_deadline().toString()+"\n";
              
              result = result+"Last Deadline:"+pr.get_last_deadline().toString()+"\n";
              
              result = result+"Username Admin:"+pr.get_username_admin()+"\n";
              
              result = result+"Username Freelancer:"+pr.get_username_freelancer()+"\n";
              
              result = result+"Username Employer:"+pr.get_username_employer()+"\n";
              
              result = result+"Amount Per deadline:"+pr.get_ammount_per_deadline()+"\n";
              
              result = result+"Files Per deadline:"+pr.get_files_per_deadline()+"\n";

              result = result+"Amount Paid:"+pr.get_paid_ammount()+"\n";

      
          }
              
              
      }
      
      
      return result;
      
  }
  
  void add_feedback(String comment, Project p)
  
          
  {
      if(comment==null)
          
      {
          //tha emfanizetai i antistoixi selida
          
      }
      
      Feedback feed = new Feedback(this.username,p.get_username_freelancer(),p.get_id(),comment, (java.sql.Date) new Date(),new Time(0,0,0));
      
      Main.feedbacks.add(feed);
  }
  
  void add_objection(String comment,Project p)
          
  {
      if(comment==null)
          
      {
          
          //tha emfanizetai i antistoixi selida
      }
      
      Enstasi enst = new Enstasi(this.username,p.get_username_admin(),p.get_id(),comment, new Date(), new Time(0,0,0),"created");
      
      Main.enstaseis.add(enst);
  }
  
  void add_rating(int a, int b, int c, int d, String comment, Project p)
          
  {
      if (a < 0 || a > 5)
          
      {
          
          //tha emfanizetai i antistoixi selida
          
          
          return;
          
      }
      
      if (b < 0 || b > 5)
          
      {
          
          //tha emfanizetai i antistoixi selida
          return;
      }
      
      if (c < 0 || c > 5)
          
      {
          
          //tha emfanizetai i antistoixi selida
          
          return;
          
      }
      
      if (d < 0 || d > 5)
          
      {
          
          //tha emfanizetai i antistoixi selida
          
          return;
          
      }
      
      if(comment==null)
      {
          //tha emfanizetai i antistoixi selida
          
          return;
      }
      
      RatingEtoF r = new RatingEtoF(a,b,c,d,p.get_username_freelancer(),this.username, new Date(), new Time(0,0,0), comment,p.get_id());
      
      
      Main.ratings_from_employers.add(r);
      
  }
  
  void logout()
          
  {
      
      //tha emfanizetai i arxiki selida tou sistimatos
  }
    
}