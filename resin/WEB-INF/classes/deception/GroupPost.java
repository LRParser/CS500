package deception;

import java.sql.Date;

public class GroupPost {
	private int id;
	private Date update_date;
	private String name;
	private String reactions;
	private int shares_count;
	private String message;
	private int group_id;
	
	public GroupPost(int id, Date update_date, String name ,String reactions, int shares_count, String message, int group_id)
	{
		this.id = id ; this.update_date = update_date;
		this.name = name; this.reactions = reactions; this.shares_count = shares_count;
		this.message = message; this.group_id = group_id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setUpdateDate(Date update_date)
	{
		this.update_date = update_date;
		
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
	public Date getUpdateDate()
	{
		return this.update_date;
		
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
	public int getGroupId()
	{
		return this.group_id;
	}
}
