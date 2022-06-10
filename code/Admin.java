
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.Date;

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
        
        
        for(Admin adm: Main.admins)
            
        {
            if (adm.get_username().equals(username) && adm.get_password().equals(password))
                
            {
                found = true;
                
            }
        }
        
        if(found ==true)
            
        {
            //tha mpei kodikas pou na ton odgei sto homepage tou Admin
            
        }
        
        
    }      
         
   
         
    void logout()
          
  {
      
      //tha emfanizetai i arxiki selida tou sistimatos
  }     
    
    
    
    void edit_info(String onoma, String eponimo, String username, String email, String password1, String decription, String ko)
    
    {
        boolean success = true;
        
        for(Admin adm: Main.admins)
            
        {
            if(adm.get_username().equals(this.get_username()))
                
            {
                
 
     
     
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
                
        for(Admin adm2: Main.admins)
            
        {
            if(adm2.get_username().equals(username))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
            
            if(adm2.get_email().equals(email))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
        }
                
             
            if(success==true)
            
            {
                adm.set_username(username);
                
                adm.set_password(password1);
                               
                adm.set_email(email);
                               
                adm.set_name(onoma);
                
                adm.set_surname(eponimo);
                                
                adm.set_ko(ko);
            
            
              }
                      
            }
                      
        }
        
        
    }
    
    String get_project_stats()
            
    {
        String result ="";
        
        for(Project p:Main.projects)
            
        {
            if(p.get_username_admin().equals(this.username))
                
            {
                result = result + p.get_title() + "|"+ p.get_status() +"|"+ p.get_last_deadline()+"\n";
                
                
            }
            
        }
        
        return result;
    }
    
    
    String get_project_stats_by_type(String type)
            
    {
        String result ="";
        
        for(Project p:Main.projects)
            
        {
            if(p.get_username_admin().equals(this.username) && p.get_status().equals(type))
                
            {
                result = result + p.get_title() + "|"+ p.get_status() +"|"+ p.get_last_deadline()+"\n";
                
                
            }
            
        }
        
        return result;
    }
    
    String get_project_stats_by_date(Date from, Date to)
            
    {
        String result ="";
        
        for(Project p:Main.projects)
            
        {
            if(p.get_username_admin().equals(this.username)&&p.get_last_deadline().after(from)&& p.get_last_deadline().before(to))
                
            {
                result = result + p.get_title() + "|"+ p.get_status() +"|"+ p.get_last_deadline()+"\n";
                
                
            }
            
        }
        
        return result;
    }
    
    int get_olokliromena()
            
    {
        int sum = 0;
        
        for(Project p:Main.projects)
            
        {
            if(p.get_username_admin().equals(this.username)&&p.get_status().equals("completed"))
                
            {
                sum++;
                
            }
            
        }
        
        return sum;
    }
    
    
     int get_dimopratimena()
            
    {
        int sum = 0;
        
        for(Project p:Main.projects)
            
        {
            if(p.get_username_admin().equals(this.username)&&p.get_status().equals("started"))
                
            {
                sum++;
                
            }
            
        }
        
        return sum;
    }
    
    Freelancer search_freelancer(String username)
    {
        Freelancer result = null;
        
        
        for(Freelancer f:Main.freelancers)
            
        {
            if(f.get_username().equals(username))
                
            {
                result = f;
                
                break;
            }
            
        }
        
        return result;
    }
    
    void delete_freelancer(Freelancer f)
            
    {
        for(Freelancer fr: Main.freelancers)
            
        {
            if(fr.get_username().equals(f.get_username()))
            {
                Main.freelancers.remove(fr);
                
                break;
                
            }
            
        }
        
    }
    
    String get_project_list()
            
    {
        String result = "";
        
        for(Project p:Main.projects)
        {
            
            if(p.get_username_admin().equals(this.username))
                
            {
                int count = 0;
                
                for(Paradoteo par:Main.paradotea)
                    
                {
                    if(par.get_project_id()==p.get_id())
                        
                    {
                        count++;
                        
                    }
                    
                }
                
                
                result = result + p.get_last_deadline() + "|" +p.get_title() +"|"+count/2+"\n";
                
            }
            
        }
        
      return result;  
    }
    
  String get_project_details(Project p)
          
  {
      String result = "";
      
      
      for(Project pr:Main.projects)
          
      {
          if(pr.get_id()==p.get_id())
              
          {
              Employer found_emp = Main.get_employer_by_username(pr.get_username_employer());
              
              Freelancer found_fr = Main.get_freelancer_by_username(pr.get_username_employer());

              
              result = result +" Onoma Employer:"+found_emp.get_name()+"\n";
              
              result = result +" Eponimo Employer:"+found_emp.get_surname()+"\n";
              
              result = result +" Email Employer:"+found_emp.get_email()+"\n";

              result = result +" Phone Employer:"+found_emp.get_phone()+"\n";

              result = result +" Onoma Freelancer:"+found_fr.get_name()+"\n";
              
              result = result +" Eponimo Freelancer:"+found_fr.get_surname()+"\n";
              
              result = result +" Email Freelancer:"+found_fr.get_email()+"\n";

              result = result +" Phone Freelancer:"+found_fr.get_phone()+"\n";
              
              result = result +" Titlos:"+pr.get_title()+"\n";
              
              result = result +" Perigrafi:"+pr.get_description()+"\n";
              
              String codes_par = " ";
              
             for(Paradoteo par: Main.paradotea)
                 
             {
                 if(par.get_project_id()==pr.get_id())
                     
                 {
                     codes_par = codes_par + "," +par.get_code_paradoteou();
                     
                 }
                 
             }
            
              result = result +" Paradotea:"+codes_par+"\n";


             result = result +" Imerominia Endiamesou Pradoteou:"+pr.get_first_deadline()+"\n";

             result = result +" Imerominia Telikou Pradoteou:"+pr.get_last_deadline()+"\n";

             result = result +" Time Ana Paradoteo:"+pr.get_ammount_per_deadline()+"\n";

              
              
          }
          
      }
      
      return result;
      
  }
  
  String get_enstaseis_info()
          
  {
      String result="";
      
      
      for(Enstasi e:Main.enstaseis)
          
      {
          if(e.get_username_admin()==this.username)
              
          {
              result = result + e.get_date() + "|" + e.get_username_employer() + "|"+ e.get_project_id() +  "|"+e.get_comment()+"\n";
              
          }
          
      }
      
      return result;
  }
  
  String get_employer_info(Employer e)
          
  {
      
      String result = "";
      for(Employer er: Main.employers)
          
          
      {
          if(er.get_username().equals(e.get_surname()))
              
          {
              
              result = result + "Onoma:"+er.get_name()+"\n";
              
              result = result + "Eponimo:"+er.get_surname()+"\n";
              
            result = result + "Email:"+er.get_email()+"\n";
            
           result = result + "TIlefono:"+er.get_phone()+"\n";

           float sum = 0;
           
           int count = 0;
           
          for(RatingFtoE r:Main.ratings_from_freelancers)
              
          {
              if(r.get_username_employer().equals(er.get_username()))
                  
              {
                  sum = sum + r.get_avg_rating();
                  
                  count++;
                  
              }
              
          }
          
       result = result + "Mesi Vathmologia:"+sum/count+"\n";

       
        result = result + "Description:"+er.get_description()+"\n";


              
          }
          
      }
          
     return result; 
  }
  
  
  
 void add_commment(Enstasi e, String com)
         
 {
     for(Enstasi en:Main.enstaseis)
         
     {
         if(e.get_project_id()==en.get_project_id())
             
         {
             en.set_comment(com);
             
         }
         
     }
     
     
     
 }
  
  
  
}