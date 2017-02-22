package deception;

public class UserWorkExperience {
	private int id;
	private String employer;
	private int user_id;
	
	
	public UserWorkExperience(int id, String employer, int user_id)
	{
		this.id = id;
		this.employer = employer;
		this.user_id = user_id;
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
	public int getUserId()
	{
		return this.user_id;
	}
	
}
