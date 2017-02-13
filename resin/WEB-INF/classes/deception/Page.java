package deception;

import java.sql.Date;

public class Page {
	
	private int id;
	private String name;
	private String about;
	private String email;
	private int is_verified;  // 0 for not verified and 1 for verified
	private int posts;       // number of total posts
	private int profile_picture; // 0 if the user doesn't have a profile picture 1 other wise
	private String contact_address;
	private int fan_count;
	private Date founded;
	private String location;
	private int were_here_count;
	private String category;
	private int overall_star_rating;
	
	
	public Page(int id)
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
	
	public void setFanCount(int fan_count)
	{
		this.fan_count = fan_count;
	}
	
	public void setFounded(Date founded)
	{
		this.founded = founded;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public void setWereHereCount(int were_here_count)
	{
		this.were_here_count = were_here_count;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public void setOverallStarRating(int overall_star_rating)
	{
		this.overall_star_rating = overall_star_rating;
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
	
	public int getFanCount()
	{
		return this.fan_count;
	}
	
	public Date getFounded()
	{
		return this.founded;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	
	public int getWereHereCount()
	{
		return this.were_here_count;
	}
	public String getCategory()
	{
		return this.category;
	}
	
	public int getOverallStarRating()
	{
		return this.overall_star_rating;
	}
	
	
}
