
public class ListOfStaff {
	String name;
	String subject;
	String training;
	String availability;
	
	public ListOfStaff (String name, String subject, String training, String availability) {
		this.name = name;
		this.subject = subject;
		this.training = training;		
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public String getTraining() {
		return training;
	}
	public String getAvailability() {
		return availability;
	}
	

}
