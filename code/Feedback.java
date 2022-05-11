package com.mycompany.projauction;
import java.sql.Date;
import java.sql.Time;




public class Feedback {
    
    private String username_admin;
        
    private String username_employer;
    
    private int project_id;
    
    private String sxolio;
    
    private Date Hmerominia_ypovolis;
    
    private Time wra_ypovolis;
    
    
    
    public Feedback(String username_admin, String username_employer, int project_id, String sxolio, Date Hmerominia_ypovolis, Time wra_ypovolis)
    
    {
       this.username_admin = username_admin;
        
       this.username_employer = username_employer;
    
       this.project_id = project_id;
    
       this.sxolio = sxolio;
    
       this.Hmerominia_ypovolis = Hmerominia_ypovolis;
       
       this.wra_ypovolis = wra_ypovolis;
}

    String get_username_admin() {
    return username_admin;
}
    
    String get_username_employer(){
    return username_employer;
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
    
    void set_username_admin(String username_admin){
    this.username_admin = username_admin;
    }
    
    void set_username_employer(String username_employer){
    this.username_employer = username_employer;
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