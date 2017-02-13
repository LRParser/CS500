package deception;

import java.sql.Date;

public class Post {
	private int id;
	private Date update_time;
	private String name;
	private String reactions;
	private int shares_count;
	private String message;
	
	public Post(int id, String name)
	{
		this.id = id ;
		this.name = name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setUpdateTime(Date update_time)
	{
		this.update_time = update_time;
		
	}
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public void setReactions(String reactions)
	{
		this.reactions = reactions;
		
	}
	
	public void setSharesCount(int shares_count)
	{
		this.shares_count = shares_count;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
		
	}
	
	public int getId()
	{
		return this.id;
	}
	public Date getUpdateTime()
	{
		return this.update_time;
		
	}
	
	public String getName()
	{
		return this.name;
		
	}
	
	public String getReactions()
	{
		return this.reactions;
		
	}
	
	public int getSharesCount()
	{
		return this.shares_count;
	}
	
	public String getMessage()
	{
		return this.message;
		
	}
}
