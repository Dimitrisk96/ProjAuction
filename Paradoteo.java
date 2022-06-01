import java.io.File;
import java.sql.Time;
import java.util.Date;

public class Paradoteo {

	private int project_id;
	private int code_paradoteou;
	private Date date;
	private Time hour;
	private File file;

	
    public Paradoteo(int project_id, int code_paradoteou, Date  date, Time hour, File file)
	{ 	
		this.project_id= project_id;
		this.code_paradoteou = code_paradoteou;
		this.date = date;
		this.hour = hour;
		this.file = file;
		
	}
    
    int get_project_id()
    {
        return project_id;
    }
            
             int get_code_paradoteou()
                     
             {
                 return code_paradoteou;
             }
        
             Date  get_date()
             {
                 return date;
             } 
             
             
             Time get_hour()
             {
                 return hour;
             }
            
             
             File get_file()
             {
                 return file;
             }
             
             
             
             
             
             
             
             void set_project_id(int project_id)
    {
        this.project_id=project_id;
    }
            
             void set_code_paradoteou(int code_paradoteou)
                     
             {
                 this.code_paradoteou=code_paradoteou;
             }
        
            void set_date(Date date)
             {
                 this.date=date;
             } 
             
             
             void set_hour(Time hour)
             {
                 this.hour=hour;
             }
            
             
             void set_file(File file)
             {
                 this.file=file;
             }
}