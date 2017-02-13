package deception;

import java.sql.Date;

public class Group {
	
	private int id;
	private String name;
	private String about;
	private String email;
	private int is_verified;  // 0 for not verified and 1 for verified
	private int posts;       // number of total posts
	private int profile_picture; // 0 if the user doesn't have a profile picture 1 other wise
	private String contact_address;
	private int member_count;
	private Date update_time;
	private String privacy;
	private Date created;
	
	
	public Group(int id)
	{
		this.id = id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public void setAbout(String about)
	{
		this.about = about;
	}
	
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setIsverfied(int is_verified)
	{
		this.is_verified = is_verified;
	}
	
	public void setPosts(int posts)
	{
		this.posts = posts;
	}
	
	public void setProfilePicture(int profile_picture)
	{
		this.profile_picture = profile_picture;
	}
	
	public void setContactAddress(String contact_address)
	{
		this.contact_address = contact_address;
	}
	
	public void setMemberCount(int member_count)
	{
		this.member_count = member_count;
	}
	
	public void setUpdateTime(Date update_time)
	{
		this.update_time = update_time;
	}
	
	public void setPrivacy(String privacy)
	{
		this.privacy = privacy;
	}
	
	public void setCreated(Date created)
	{
		this.created = created;
	}
	
	
	public int getId()
	{
		return this.id ;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
	public String getAbout()
	{
		return this.about;
	}
	
	
	public String getEmail()
	{
		return this.email;
	}
	
	public int getIsverfied()
	{
		return this.is_verified;
	}
	
	public int getPosts()
	{
		return this.posts;
	}
	
	public int getProfilePicture()
	{
		return this.profile_picture;
	}
	
	public String getContactAddress()
	{
		return this.contact_address;
	}
	
	public int getMemberCount()
	{
		return this.member_count;
	}
	
	public Date getUpdateTime()
	{
		return this.update_time;
	}
	
	public String getPrivacy()
	{
		return this.privacy;
	}
	
	public Date getCreated()
	{
		return this.created;
	}
	
	
}
