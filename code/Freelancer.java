
   
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.Date;
import java.io.*;
import java.util.ArrayList;

import java.sql.Time;
import java.util.Collections;



public class Freelancer {
    
    private String username;
    private String name;
    private String surname;
    private String password;
    private String email;
    private int phone;
    private Date birthdate;
    private String description;
    private File cv;
    private String ko;
    
    
    public Freelancer(String username, String name, String surname, String password, String email, int phone, Date birthdate, String description, File cv, String ko)
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
    
    File get_cv()
            
    {
        
        return cv;
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
    
    void set_cv(File cv)
            
    {
        this.cv = cv;
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
        
        
        for(Freelancer fl: Main.freelancers)
            
        {
            if (fl.get_username().equals(username) && fl.get_password().equals(password))
                
            {
                found = true;
                
            }
        }
        
        if(found ==true)
            
        {
            //tha mpei kodikas pou na ton odgei sto homepage tou Employer
            
        }
        
        
    }
    
    void register(String onoma, String eponimo, String username, String email, String password1,String password2, int phone_number, Date imer, String description, File cv, String ko)
            
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
     
     
      if(password1.equals(null))
         
     {
         //tha emanizetai i antistoixi selida
         
         return;
         
     }
      
       if(password2.equals(null))
         
     {
         //tha emanizetai i antistoixi selida
         
         return;
         
     }
       
       if(cv.length()>100000000)
           
       {
           
           //tha emfanizetai i antistoixi selida
           
           return;
       }

        String fname = cv.getName();
        
        String file = fname.substring(fname.lastIndexOf("/"));
       String extension = file.substring(file.indexOf("."));
       
       if(!extension.equals("pdf"))
           
       {
           
           //tha emfanizetai i antistoixi selida
           
           return;
           
       }
        
        
        
        
        for(Freelancer fl: Main.freelancers)
            
        {
            if(fl.get_username().equals(username))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
            
            if(fl.get_email().equals(email))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
            
            
            
            
        }
        
        if(success==true)
            
        {
            Freelancer f1 = new Freelancer(username,onoma,eponimo,password1,email,phone_number,imer,description, cv,ko);

            Main.freelancers.add(f1);
            
        }
        
        
    }
    
    
void edit_info(String onoma, String eponimo, String username, String email, String password1,String password2, int phone_number, String description, File cv, String ko)
    
    {
        boolean success = true;
        
        for(Freelancer fl: Main.freelancers)
            
        {
            if(fl.get_username().equals(this.get_username()))
                
            {
                
         
         
               
         
      
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
                
                
         String fname = cv.getName();
        
        String file = fname.substring(fname.lastIndexOf("/"));
       String extension = file.substring(file.indexOf("."));
       
       if(!extension.equals("pdf"))
           
       {
           
           //tha emfanizetai i antistoixi selida
           
           return;
           
       }
                
        for(Freelancer fl2: Main.freelancers)
            
        {
            if(fl2.get_username().equals(username))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
            
            if(fl2.get_email().equals(email))
                
            {
                //tha emfanizetai i selida me to diagnostiko minima
                
                success = false;
                
                break;
            }
            
        }
                
             
            if(success==true)
            
            {
                fl.set_username(username);
                
                fl.set_password(password1);
                
                fl.set_phone(phone_number);
                
                fl.set_email(email);
                                
                fl.set_name(onoma);
                
                fl.set_surname(eponimo);
                                
                fl.set_description(description);
                
               fl.set_cv(cv);
               
               fl.set_ko(ko);
            
            
              }
        
                
            }
            
          
            
        }
        
      
    }

 public ArrayList<Project> get_all_projects()
         
 {
     
     return Main.projects;
 }
 
 
 public ArrayList<Project> get_projects_by_date(Date from, Date to)
         
 {
     ArrayList<Project> result = new ArrayList<Project>();
     
     
     for(Project p:Main.projects)
         
     {
         
         if(p.get_last_deadline().before(to) && p.get_last_deadline().after(from))
             
         {
             result.add(p);
             
         }
         
     }
     
     
     return result;
 }
 
 String get_employer_info(Employer e)
         
 {
     String result = "";
     
     for(Employer emp:Main.employers)
         
     {
         if(emp.get_username().equals(e.get_username()))
             
         {
             result = result + "Name:" + emp.get_name() + "\n";
             
            result = result + "Surname:" + emp.get_surname()+ "\n";
            
           
            result = result + "Phone:" + emp.get_phone() + "\n";

            
           result = result + "Email:" + emp.get_email() + "\n";
           
           
           double sum_ratings = 0;
           
           int count_ratings = 0;

           for(RatingFtoE r: Main.ratings_from_freelancers)
               
           {
               if(r.get_username_employer().equals(emp.get_username()))
                   
               {
                   sum_ratings = sum_ratings + r.get_avg_rating();
                   
                   count_ratings++;
                   
               }
               
           }

           float avg = (float)sum_ratings/count_ratings;
           
            
           result = result + "Avg Of Ratings:" + avg + "\n";

             
             
         }
         
     }
     
     return result;
 }
 
 
 void add_rating(int a, int b, String comment,Project p)
         
 {
     float avg = (float)(a+b)/2;
     
     RatingFtoE r = new RatingFtoE(a,b,this.get_username(),p.get_username_employer(),avg, new Date(), new Time(0,0,0),comment,p.get_id());
     
     Main.ratings_from_freelancers.add(r);
 }
 
 String get_portofolio_info()
         
 {
     String result="Titlos| Imerominia | Poso Pliromis\n";
     
     float sum = 0;
    
     
     for(Payment p:Main.payments)
         
     {
         if(p.get_username_freelancer().equals(this.get_username()))
             
         {
             
             String project_title = "";
             
             for(Project pr: Main.projects)
                 
             {
                 if(pr.get_id()==p.get_project_id())
                     
                 {
                     project_title = pr.get_title();
                     
                     break;
                 }
                 
             }
             
             result = result + project_title +"|"+p.get_date().toString()+"|"+p.get_ammount()+"\n";
             
             sum=sum+p.get_ammount();
             
         }
         
     }
     
     result = result+"Total Balance:"+sum;
     
     
     return result;
 }
 
 String get_portofolio_info_filtered(Date from, Date to)
         
 {
     String result="Titlos| Imerominia | Poso Pliromis\n";
     
     float sum = 0;
     
     
     if(from==null)
         
     {
         //tha emfanizetai i antistoixi selida
         
     }
     
     if(to==null)
         
     {
         
         //tha emfanizetai i antistoixi slida
         
     }
     
     if(to.before(from))
         
     {
         
         //tha emganizetai i antistoixi selida
     }
    
     
     for(Payment p:Main.payments)
         
     {
         if(p.get_username_freelancer().equals(this.get_username()) && p.get_date().after(from)&& p.get_date().before(to))
             
         {
             
             String project_title = "";
             
             for(Project pr: Main.projects)
                 
             {
                 if(pr.get_id()==p.get_project_id())
                     
                 {
                     project_title = pr.get_title();
                     
                     break;
                 }
                 
             }
             
             result = result + project_title +"|"+p.get_date().toString()+"|"+p.get_ammount()+"\n";
             
             sum=sum+p.get_ammount();
             
         }
         
     }
     
     result = result+"Total Balance:"+sum;
     
     
     return result;
 }
 
 void print_portofolio_info()
         
 {
     System.out.println(get_portofolio_info());
     
 }
 
 void print_portofolio_info_filtered(Date from, Date to)
         
 {
     
     System.out.println(get_portofolio_info_filtered(from,to));
     
 }
 
 ArrayList<Paradoteo> get_paradotea()
         
 {
     return Main.paradotea;
 }
 
 public void upload_paradoteo(int project_id, int code_paradoteou, File file)
 
 {
     if(file.length()>500000)
         
     {
         //tha emfanizetai i antistoixi selida
         return ;
     }
     
     String fname = file.getName();
        
    String myfile = fname.substring(fname.lastIndexOf("/"));
    
    String extension = myfile.substring(myfile.indexOf("."));
       
     if(!extension.equals("pdf") ||!extension.equals("docx") )
           
       {
           
           //tha emfanizetai i antistoixi selida
           
          return;
           
       }
     
     Paradoteo par = new Paradoteo(project_id,code_paradoteou,new Date(), new Time(0,0,0),file );
     
     Main.paradotea.add(par);
     
 }
 
 String get_projects_info()
         
 {
     String result = "Titlos|Paradotea|Elegxos|Sxolia Admin|Sxolia Employer\n";

     
     for(Project p:Main.projects)
         
     {
         if(p.get_username_freelancer().equals(this.username))
             
         {
             result = result + p.get_title()+ "|";
             
             for(Paradoteo par:Main.paradotea)
                 
             {
                 
                 if(par.get_project_id()==p.get_id())
                     
                 {
                     
                     result = result + par.get_code_paradoteou() + " ";
                 }
             }
             
             result =result + "|";
             
            for(Feedback f:Main.feedbacks) 
                
            {
                if(f.get_from().equals(p.get_username_admin()) &&f.get_to().equals(p.get_username_freelancer()))
                        
                        {
                           result = result + f.get_sxolio();
                        }
            }
            
            result = result + "|";
            
            for(Feedback f:Main.feedbacks) 
                
            {
                if(f.get_from().equals(p.get_username_employer()) &&f.get_to().equals(p.get_username_freelancer()))
                        
                        {
                           result = result + f.get_sxolio();
                        }
            }
             
         }
         
     }
     
     
     return result;
 }
 void accept_project_assignment(Offer f)
         
 {
     int code = -1;
     
    for(Offer o: Main.offers)
        
    {
        if(o.get_username_freelancer().equals(this.username)&&o.get_project_request_id()==f.get_project_request_id())
            
        {
            code = o.get_project_request_id();
            
            Main.offers.remove(o);
            
            break;
            
        }
        
    }
    
    Admin adm_project = new Admin("","","","","","");
    for(ProjectRequest pr:Main.project_requests)
        
    {
        if(pr.get_id()==code)
            
        {
            
            for(Admin adm:Main.admins)
                
            {
                if(pr.get_description().contains(adm.get_ko()))
                    
                {
                    adm_project = adm;
                }
                    
                {
                    
                    
                }
            }
            
            Project newpro  = new Project(pr.get_id(),this.username,pr.get_username_employer(),adm_project.get_username(),pr.get_first_deadline(),pr.get_final_deadline(),f.get_bid()/2,pr.get_accomp_files(),"started",0);
            
            Main.projects.add(newpro);
            
            
            
        }
        
    }
    
   
    
 }
 
  public ArrayList<RatingEtoF> get_ratings()
    
    {
        ArrayList<RatingEtoF> result = new ArrayList<RatingEtoF>();
        
        
        for(RatingEtoF r: Main.ratings_from_employers)
            
        {
            if(r.get_username_freelancer().equals(this.username))
                
            {
                
                result.add(r);
            }
            
        }
        
        
        return result;
    }
  
  public ArrayList<RatingEtoF> get_ratings_asc()
          
  {
     return sort_asc(get_ratings());
  }
  
  public ArrayList<RatingEtoF> get_ratings_desc()
          
  {
      
      return sort_desc(get_ratings());
      
  }
 
  public ArrayList<RatingEtoF> sort_asc(ArrayList<RatingEtoF> mylist)
  {
  for (int i = 0; i < mylist.size()-1; i++)
{
   for(int j = 0; j < mylist.size()-i-1; j++)
   {
            if(mylist.get(j).get_avg_rating() > mylist.get(j + 1).get_avg_rating())
            {
                   Collections.swap(mylist,j,j+1);
            }
   }
}
  
  return mylist;
  }
  
   public ArrayList<RatingEtoF> sort_desc(ArrayList<RatingEtoF> mylist)
  {
  for (int i = 0; i < mylist.size()-1; i++)
{
   for(int j = 0; j < mylist.size()-i-1; j++)
   {
            if(mylist.get(j).get_avg_rating() < mylist.get(j + 1).get_avg_rating())
            {
                   Collections.swap(mylist,j,j+1);
            }
   }
}
  
  return mylist;
  }
  
   void print_ratings()
           
   {
       ArrayList<RatingEtoF> result = get_ratings();
       
       float sum_avg = 0;
       
       for(RatingEtoF r:result)
           
       {
           System.out.println(r.get_project_id() + "|"+r.get_date().toString()+"|"+r.get_avg_rating());
           sum_avg = sum_avg + r.get_avg_rating();
           
       }
       
       System.out.println("Mesos oros vathmologias:"+sum_avg/result.size());
   }
   
   ArrayList<ProjectRequest> get_project_requests()
           
   {
       
       return Main.project_requests;
   }
   
   String get_project_request_info(ProjectRequest p)
           
   {
       String result = "";
       
       
       for(ProjectRequest pr:Main.project_requests)
           
       {
           
           if(pr.get_id()==p.get_id())
               
           {
               result  = result + "ID:"+ pr.get_id()+"\n";
               
               result = result  + "TITLE:"+pr.get_title()+"\n";
               
               result = result + "FIST DEADLINE:"+ pr.get_first_deadline().toString()+"\n";
               
               result = result + "LAST DEADELINE:"+pr.get_final_deadline().toString()+"\n";
               
               result = result + "MAXIMIM BID:"+pr.get_maximum_bid()+"\n";
               
               result = result + "START DATE:"+pr.get_start_date().toString()+"\n";
               
               result = result +"END DATE:"+ pr.get_end_date().toString()+"\n";
               
               result = result +"ACCOMPLISED FILES:"+ pr.get_accomp_files().toString()+"\n";
               
           }
           
           
       }
       
       return result;
   }
  
  void bid(ProjectRequest p, int amount)
          
  {
      if(amount==-1)
          
      {
          //tha emfanizetai i antistoixi selida
          
      }
      
      Offer o = new Offer(this.username,p.get_id(),amount,new Date(),"new_offer");
      
      
      Main.offers.add(o);
      
  }
}