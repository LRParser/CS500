package deception;

import java.sql.Date;

public class Group {
	
	private int id;
	private String name;
	private String about;
	private String email;
	private boolean is_verified;  
	private int posts;       // number of total posts
	private boolean profile_picture; 
	private String contact_address;
	private int member_count;
	private Date update_date;
	private String privacy;
	private Date created;
	private int user_id;
	
	
	public Group(int id, String name, String about, String email, boolean is_verified, boolean profile_picture,
					String contact_address, int member_count, Date update_date, String privacy, Date created, int user_id)
	{
		this.id = id; this.name = name; this.about = about; this.email = email; this.is_verified = is_verified; this.profile_picture = profile_picture;
		this.contact_address = contact_address; this.member_count = member_count; this.update_date = update_date;
		this.privacy = privacy; this.created = created; this.user_id = user_id;
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
	
	public void setIsverfied(boolean is_verified)
	{
		this.is_verified = is_verified;
	}
	
	public void setPosts(int posts)
	{
		this.posts = posts;
	}
	
	public void setProfilePicture(boolean profile_picture)
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
	
	public void setUpdateTime(Date update_date)
	{
		this.update_date = update_date;
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
	
	public boolean getIsverified()
	{
		return this.is_verified;
	}
	
	public int getPosts()
	{
		return this.posts;
	}
	
	public boolean getProfilePicture()
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
		return this.update_date;
	}
	
	public String getPrivacy()
	{
		return this.privacy;
	}
	
	public Date getCreated()
	{
		return this.created;
	}
	public int getUserId()
	{
		return this.user_id;
	}
	
}
