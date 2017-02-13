package deception;

public class UserWorkExperience {
	private int id;
	private String employer;
	
	
	public UserWorkExperience(int id)
	{
		this.id = id;
	}
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setEmployer(String employer)
	{
		this.employer = employer;
	}
	
	
	
	public int getId()
	{
		return this.id;
	}
	
	public String getEmployer()
	{
		return this.employer;
	}
	
	
}
