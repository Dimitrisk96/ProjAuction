import java.sql.Date;
import java.sql.Time;

public class Feedback {
    
    private String from;
        
    private String to;
    
    private int project_id;
    
    private String sxolio;
    
    private Date Hmerominia_ypovolis;
    
    private Time wra_ypovolis;
    
    
    
    public Feedback(String from, String to, int project_id, String sxolio, Date Hmerominia_ypovolis, Time wra_ypovolis)
    
    {
       this.from = from;
        
       this.to = to;
    
       this.project_id = project_id;
    
       this.sxolio = sxolio;
    
       this.Hmerominia_ypovolis = Hmerominia_ypovolis;
       
       this.wra_ypovolis = wra_ypovolis;
}

    String get_from() {
    return from;
}
    
    String get_to(){
    return to;
    }
    
    int get_project_id(){
    return project_id;
    }
    
    String get_sxolio(){
    return sxolio;
    }
    
    Date get_Hmerominia_ypovolis(){
    return Hmerominia_ypovolis;
    }
    
    Time get_wra_ypovolis(){
    return wra_ypovolis;
    }
    
    void set_from(String from){
    this.from = from;
    }
    
    void set_to(String username_employer){
    this.to = to;
    }
    
    void set_project_id(int project_id){
    this.project_id = project_id;
    }
    
    void set_sxolio(String sxolio){
    this.sxolio = sxolio;
    }
    
    void set_Hmerominia_ypovolis(Date Hmerominia_ypovolis){
    this.Hmerominia_ypovolis = Hmerominia_ypovolis;
    }
    
     void set_wra_ypovolis(Time wra_ypovolis){
    this.wra_ypovolis = wra_ypovolis;
    }
}