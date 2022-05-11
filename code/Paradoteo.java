

import java.sql.Time;
import java.util.Date;

public class Paradoteo {

	private String project_id;
	private String code_paradoteou;
	private Date date;
	private Time hour;
	private String file;

	
    public Paradoteo(String project_id, String code_paradoteou, Date  date, Time hour, String file)
	{ 	
		this.project_id= project_id;
		this.code_paradoteou = code_paradoteou;
		this.date = date;
		this.hour = hour;
		this.file = file;
		
	}
}
