import java.sql.Time;
import java.util.Date;

public class Payment {

    private String username_freelancer;
    private String username_employer;
    private int project_id;
    private int ammount;
    private Date date;
    private Time hour;

    public Payment(String username_employer, String username_freelancer, int project_id, int ammount, Date date, Time hour)
    {
        this.username_freelancer = username_freelancer;
        this.username_employer = Username_employer;
        this.project_id=project_id;
        this.ammount = ammount;
        this.date = date;
        this.hour = hour;
    }
}
