package deception;

import java.sql.Date;

public class User {
	
	private int id;
	private String name;
	private String about;
	private String email;
	private boolean is_verified;  // 0 for not verified and 1 for verified
	private int posts;       // number of total posts
	private boolean profile_picture; // 0 if the user doesn't have a profile picture 1 other wise
	private String contact_address;
	private int likes; // total number of likes
	private int friends_count;
	private Date member_since; 
	
	
	public User(int id, String name, String about, String email, boolean is_verified,
			boolean profile_picture, String contact_address, int likes, int friends_count,
			Date member_since)
	{
		this.id = id; this.is_verified = is_verified;
		this.name = name; this.profile_picture = profile_picture;
		this.about = about; this.contact_address = contact_address;
		this.email = email; this.likes = likes;
		this.friends_count = friends_count;
		this.member_since = member_since;
		System.out.println("User constructed");
		
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
	
	public void setLikes(int likes)
	{
		this.likes = likes;
	}
	
	
	public void setFriendsCount(int friends_count)
	{
		this.friends_count = friends_count;
	}
	
	public void setMemberSince(Date member_since)
	{
		this.member_since = member_since;
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
	
	public int getLikes()
	{
		return this.likes;
	}
	
	
	public int getFriendsCount()
	{
		return this.friends_count;
	}
	
	public Date getMemberSince()
	{
		return this.member_since;
	}
	public String toHTML() {
		  return "<tr><td>" + id + "</td><td>" + name + "</td><td>" + about + "</td><td>"+ email + "</td><td>"
				  + is_verified + "</td><td>" + profile_picture + "</td><td>" + contact_address + "</td><td>"
				  + likes + "</td><td>" + friends_count + "</td><td>"+ member_since + "</td><td>";
	  }
	
}
