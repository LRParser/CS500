package deception;

import java.sql.Date;

public class Page {
	
	private int id;
	private String name;
	private String about;
	private String email;
	private boolean is_verified;  // 0 for not verified and 1 for verified
	private int posts;       // number of total posts
	private boolean profile_picture; // 0 if the user doesn't have a profile picture 1 other wise
	private String contact_address;
	private int fan_count;
	private Date founded;
	private String location;
	private int were_here_count;
	private String category;
	private int overall_star_rating;
	private int user_id;
	
	
	public Page(int id, String name, String about, String email, boolean is_verified, boolean profile_picture,
			String contact_address, int fan_count, Date founded, String location, int were_here_count, String category,
			int overall_star_rating, int user_id)
			{
				this.id = id; this.name = name; this.about = about; this.email = email; this.is_verified = is_verified; this.profile_picture = profile_picture;
				this.contact_address = contact_address; this.fan_count = fan_count; this.founded = founded;this.location = location;
				this.were_here_count = were_here_count; this.category = category; this.overall_star_rating = overall_star_rating; this.user_id = user_id;
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
	
	public void setIsverified(boolean is_verified)
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
	
	public int getUserId()
	{
		return this.user_id;
	}
	
	
}
