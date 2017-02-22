package deception;

public class UserEducationExperience {
	private int id;
	private String school;
	private String studied_with;
	private int user_id;
	
	public UserEducationExperience(int id, String school, String studied_with, int user_id)
	{
		this.id = id;
		this.school = school;
		this.studied_with = studied_with;
		this.user_id = user_id;
	}
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setSchool(String school)
	{
		this.school = school;
	}
	
	public void setStudiedWith(String studied_with)
	{
		this.studied_with = studied_with;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getSchool()
	{
		return this.school;
	}
	
	public String getStudiedWith()
	{
		return this.studied_with;
	}
	public int getUserId()
	{
		return this.user_id;
	}
}
