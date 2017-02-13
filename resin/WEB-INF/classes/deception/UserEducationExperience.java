package deception;

public class UserEducationExperience {
	private int id;
	private String school;
	private String studied_with;
	
	public UserEducationExperience(int id)
	{
		this.id = id;
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
}
