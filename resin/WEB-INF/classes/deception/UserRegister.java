package deception;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import com.caucho.jsp.Page;


public class UserRegister {
  
  private static Connection _conn = null;
  private static ResourceBundle _bundle;
  
  /**
   * 
   * @param bundle - resource bundle that contains database connection information
   * @return
   */     
  public String openDBConnection(String bundle) {
	 _bundle = ResourceBundle.getBundle(bundle);
	 return openDBConnection(
			 _bundle.getString("dbUser"), 
			 _bundle.getString("dbPass"),
			 _bundle.getString("dbSID"), 
			 _bundle.getString("dbHost"), 
			 Integer.parseInt(_bundle.getString("dbPort"))
			 );
  }
  
  /**
   * Open the database connection.
   * @param dbUser
   * @param dbPass
   * @param dbSID
   * @param dbHost
   * @return
   */
  public String openDBConnection(String dbUser, String dbPass, String dbSID, String dbHost, int port) {
    
    String res="";
    if (_conn != null) {
      closeDBConnection();
    }
  
    try {
       _conn = DBUtils.openDBConnection(dbUser, dbPass, dbSID, dbHost, port);
       res = DBUtils.testConnection(_conn);
    } catch (SQLException sqle) {
      sqle.printStackTrace(System.err);
    } catch (ClassNotFoundException cnfe) {
      cnfe.printStackTrace(System.err);
    }
    return res;
  }
  
  /**
   * Close the database connection.
   */
  public void closeDBConnection() {
    try {
      DBUtils.closeDBConnection(_conn);
      System.out.println("Closed a connection");
    } catch (SQLException sqle) {
      sqle.printStackTrace(System.err);
    }
  }
  
  
  
  public ArrayList<User> getUser() throws SQLException{
	  ArrayList<User> roster = new ArrayList<User>();
      
      String query = "select * from User_";
     
      Statement st = _conn.createStatement();
       ResultSet rs = st.executeQuery(query);
       
       while (rs.next()) {
       
         int id = rs.getInt("id");
         String name = rs.getString("name");
         String about = rs.getString("about");
         String email = rs.getString("email");
         boolean is_verified = rs.getBoolean("is_verified");
         boolean profile_picture = rs.getBoolean("profile_picture");
         String contact_address = rs.getString("contact_address");
         int likes = rs.getInt("likes");
         int friends_count = rs.getInt("friends_count");
         Date member_since = rs.getDate("member_since");
         
       
         User user = new User(id, name, about, email, is_verified, profile_picture, contact_address,
        		 likes, friends_count, member_since);
         
          
         roster.add(user);
       }
       
       rs.close();
       st.close();

   return roster;
	  
  }
  
  public User getSomeUser(HttpServletRequest request) throws SQLException{
	 User user = null;
	 String username = request.getParameter("username");
		//int id1 = Integer.parseInt(request.getParameter("id"));
      System.out.println("Looking for user with name: " + username);
      
      String query = "select * from User_ where name= '"+ username +"'";
     
      System.out.println("Query is" + query);

      
      Statement st = _conn.createStatement();
       ResultSet rs = st.executeQuery(query);
              
       int size = 0;
       
       while (rs.next()) {
       
         int id = rs.getInt("id");
         String name = rs.getString("name");
         String about = rs.getString("about");
         String email = rs.getString("email");
         boolean is_verified = rs.getBoolean("is_verified");
         boolean profile_picture = rs.getBoolean("profile_picture");
         String contact_address = rs.getString("contact_address");
         int likes = rs.getInt("likes");
         int friends_count = rs.getInt("friends_count");
         Date member_since = rs.getDate("member_since");
         
         size++;
         
       
         user = new User(id, name, about, email, is_verified, profile_picture, contact_address,
        		 likes, friends_count, member_since);
         
          
        
       }
       
       System.out.println("ResultSet size is: "+size);

       
       rs.close();
       st.close();
       
       if(user == null) {
    	   System.out.println("Queried for User but none found - did you specify a name?");
       }

   return user;
	  
  }
  
  public ArrayList<UserEducationExperience> getUserEducationExperiencesByName(HttpServletRequest request) throws SQLException{
	  ArrayList<UserEducationExperience> roster = new ArrayList<UserEducationExperience>();
		 String username = request.getParameter("username");

	      String query = "select UE.id, UE.school,UE.studied_with, UE.user_id from UserEducationExperience_has UE, User_ U where UE.user_id = U.id and U.name = '"+ username +"'";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	        
	         String school = rs.getString("school");
	         int id = rs.getInt("id");
	         String studied_with = rs.getString("studied_with");
	         int user_id = rs.getInt("user_id");
	         
	         roster.add(new UserEducationExperience(id, school, studied_with, user_id));
	       
	        
	         
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return roster;
		  
	  }
  
  public ArrayList<UserWorkExperience> getAllUserWorkExperiences() throws SQLException{
		  ArrayList<UserWorkExperience> allExperiences = new ArrayList<UserWorkExperience>();

	      String query = "select * from UserWorkExperience_has UWE";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	        
	         String employer = rs.getString("employer");
	         int id = rs.getInt("id");
	     
	         int user_id = rs.getInt("user_id");
	   	  	UserWorkExperience uwe = new UserWorkExperience(id, employer, user_id);
	         allExperiences.add(uwe);
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allExperiences;
		  
	  }
  
  public ArrayList<UserEducationExperience> getAllUserEducationExperiences() throws SQLException{
	  ArrayList<UserEducationExperience> allExperiences = new ArrayList<UserEducationExperience>();

      String query = "select * from UserEducationExperience_has UEE";
     
      Statement st = _conn.createStatement();
       ResultSet rs = st.executeQuery(query);
       
       while (rs.next()) {
    	   
	         String school = rs.getString("school");
	         int id = rs.getInt("id");
	         String studied_with = rs.getString("studied_with");
	         int user_id = rs.getInt("user_id");
	         
	         UserEducationExperience uee = new UserEducationExperience(id, school, studied_with, user_id);
	         allExperiences.add(uee);
        
       }
       
       rs.close();
       st.close();

   return allExperiences;
	  
  }
  
  public ArrayList<UserWorkExperience> getSpecificUserWorkExperiences(HttpServletRequest request) throws SQLException{
	  UserWorkExperience uwe = null;
		 String username = request.getParameter("username");
		  ArrayList<UserWorkExperience> allExperiences = new ArrayList<UserWorkExperience>();

	      String query = "select UWE.id, UWE.employer, UWE.user_id from UserWorkExperience_has UWE, User_ U where UWE.user_id = U.id and U.name = '"+ username +"'";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	        
	         String employer = rs.getString("employer");
	         int id = rs.getInt("id");
	         
	         int user_id = rs.getInt("user_id");
	         
	         uwe = new UserWorkExperience(id, employer, user_id);
	         allExperiences.add(uwe);
	        
	         
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allExperiences;
		  
	  }
  
  public ArrayList<Group> getAllGroups() throws SQLException {
	  ArrayList<Group> allGroups = new ArrayList<Group>();
			      
	     String query = "select * from Owns_Group O";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	    	   
	        int id = rs.getInt("id");
	        String name = rs.getString("name");
	         String about = rs.getString("about");
	         String email = rs.getString("email");
	         boolean is_verified = rs.getBoolean("is_verified");
	         boolean profile_picture = rs.getBoolean("profile_picture");
	         String contact_address = rs.getString("contact_address");
	         int member_count = rs.getInt("member_count");
	         Date update_date = rs.getDate("update_date");
	         String privacy = rs.getString("privacy");
	         Date created = rs.getDate("created");
	         int user_id = rs.getInt("user_id");
	         
	         Group group = new Group(id,name, about, email, is_verified, profile_picture, 
	        		 contact_address, member_count, update_date, privacy, created, user_id );
	       
	        
	         allGroups.add(group);
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allGroups;
  }
  
  public ArrayList<Group> getGroupsOwnedByUserName(HttpServletRequest request) throws SQLException{
	  ArrayList<Group> allGroups = new ArrayList<Group>();
		 String username = request.getParameter("username");
			
	      
	     String query = "select O.id, O.name, O.about, O.email, O.is_verified, O.profile_picture,"
	     		+ "O.contact_address, O.member_count, O.update_date, O.privacy, O.created, O.user_id" + 
	    	  " from Owns_Group O, User_ U "
	    		  + "where O.user_id = U.id and U.name = '"+ username +"'";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	    	   
	        int id = rs.getInt("id");
	        String name = rs.getString("name");
	         String about = rs.getString("about");
	         String email = rs.getString("email");
	         boolean is_verified = rs.getBoolean("is_verified");
	         boolean profile_picture = rs.getBoolean("profile_picture");
	         String contact_address = rs.getString("contact_address");
	         int member_count = rs.getInt("member_count");
	         Date update_date = rs.getDate("update_date");
	         String privacy = rs.getString("privacy");
	         Date created = rs.getDate("created");
	         int user_id = rs.getInt("user_id");
	         
	         Group group = new Group(id,name, about, email, is_verified, profile_picture, 
	        		 contact_address, member_count, update_date, privacy, created, user_id );
	       
	        
	         allGroups.add(group);
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allGroups;
		  
	  }
  
  public ArrayList<deception.Page> getAllPages() throws SQLException {
	  ArrayList<deception.Page> allPages = new ArrayList<deception.Page>();
			      
	     String query = "select * from Owns_Page O";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	    	   
		        int id = rs.getInt("id");
		        String name = rs.getString("name");
		         String about = rs.getString("about");
		         String email = rs.getString("email");
		         boolean is_verified = rs.getBoolean("is_verified");
		         boolean profile_picture = rs.getBoolean("profile_picture");
		         String contact_address = rs.getString("contact_address");
		         int fan_count = rs.getInt("fan_count");
		         Date founded = rs.getDate("founded");
		         String location = rs.getString("location");
		         int were_here_count = rs.getInt("were_here_count");
		         String category = rs.getString("category");
		         int overall_star_rating = rs.getInt("overall_star_rating");
		         int user_id = rs.getInt("user_id");
		         
		         deception.Page page = new deception.Page(id,name, about, email, is_verified, profile_picture, 
		        		 contact_address, fan_count, founded, location, were_here_count, category, overall_star_rating, user_id);
		         allPages.add(page);
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allPages;
  }

public ArrayList<deception.Page> getUserOwnedPages(HttpServletRequest request) throws SQLException{
	  ArrayList<deception.Page> allPages = new ArrayList<deception.Page>();
		 String username = request.getParameter("username");
			
	      
	     String query = "select O.id, O.name, O.about, O.email, O.is_verified, O.profile_picture,"
	     		+ "O.contact_address, O.fan_count, O.founded, O.location, O.were_here_count,O.category, "
	     		+ "O.overall_star_rating, O.user_id" + 
	    	  " from Owns_Page O, User_ U "
	    		  + "where O.user_id = U.id and U.name = '"+ username +"'";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	    	   
	        int id = rs.getInt("id");
	        String name = rs.getString("name");
	         String about = rs.getString("about");
	         String email = rs.getString("email");
	         boolean is_verified = rs.getBoolean("is_verified");
	         boolean profile_picture = rs.getBoolean("profile_picture");
	         String contact_address = rs.getString("contact_address");
	         int fan_count = rs.getInt("fan_count");
	         Date founded = rs.getDate("founded");
	         String location = rs.getString("location");
	         int were_here_count = rs.getInt("were_here_count");
	         String category = rs.getString("category");
	         int overall_star_rating = rs.getInt("overall_star_rating");
	         int user_id = rs.getInt("user_id");
	         
	         deception.Page page = new deception.Page(id,name, about, email, is_verified, profile_picture, 
	        		 contact_address, fan_count, founded, location, were_here_count, category, overall_star_rating, user_id);
	       
	        
	         allPages.add(page);
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allPages;
		  
	  }
  
  public ArrayList<UserPost> getUserOwnedPosts(HttpServletRequest request) throws SQLException{
	  ArrayList<UserPost> allPosts = new ArrayList<UserPost>();
		 String username = request.getParameter("username");
			
	      
	     String query = "select O.id,O.update_date, O.name, O.reactions, O.shares_count, O.message, O.user_id" +
	    	  " from User_Post O, User_ U "
	    		  + "where O.user_id = U.id and U.name = '"+ username +"'";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	    	   
	        int id = rs.getInt("id");
	        Date update_date = rs.getDate("update_date");
	        String name = rs.getString("name");
	         String reactions = rs.getString("reactions");
	         int shares_count = rs.getInt("shares_count");
	         String message = rs.getString("message");
	         int user_id = rs.getInt("user_id");
	         
	         UserPost post = new UserPost(id, update_date, name, reactions, shares_count, message, user_id);
	       
	        
	         allPosts.add(post);
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allPosts;
		  
	  }
 
  public ArrayList<PagePost> getPageOwnedPosts(HttpServletRequest request) throws SQLException{
	  ArrayList<PagePost> allPosts = new ArrayList<PagePost>();
		 String username = request.getParameter("pageusername");
			
	      
	     String query = "select O.id,O.update_date, O.name, O.reactions, O.shares_count, O.message, O.page_id" +
	    	  " from Page_Post O, Owns_Page U "
	    		  + "where O.page_id = U.id and U.name = '"+ username +"'";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	    	   
	        int id = rs.getInt("id");
	        Date update_date = rs.getDate("update_date");
	        String name = rs.getString("name");
	         String reactions = rs.getString("reactions");
	         int shares_count = rs.getInt("shares_count");
	         String message = rs.getString("message");
	         int page_id = rs.getInt("page_id");
	         
	         PagePost post = new PagePost(id, update_date, name, reactions, shares_count, message, page_id);
	       
	        
	         allPosts.add(post);
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allPosts;
		  
	  }
  
  public ArrayList<GroupPost> getGroupOwnedPosts(HttpServletRequest request) throws SQLException{
	  ArrayList<GroupPost> allPosts = new ArrayList<GroupPost>();
		 String username = request.getParameter("groupusername");
			
	      
	     String query = "select O.id,O.update_date, O.name, O.reactions, O.shares_count, O.message, O.group_id" +
	    	  " from Group_Post O, Owns_Group U "
	    		  + "where O.group_id = U.id and U.name = '"+ username +"'";
	     
	      Statement st = _conn.createStatement();
	       ResultSet rs = st.executeQuery(query);
	       
	       while (rs.next()) {
	       
	    	   
	        int id = rs.getInt("id");
	        Date update_date = rs.getDate("update_date");
	        String name = rs.getString("name");
	         String reactions = rs.getString("reactions");
	         int shares_count = rs.getInt("shares_count");
	         String message = rs.getString("message");
	         int group_id = rs.getInt("group_id");
	         
	         GroupPost post = new GroupPost(id, update_date, name, reactions, shares_count, message, group_id);
	       
	        
	         allPosts.add(post);
	          
	        
	       }
	       
	       rs.close();
	       st.close();

	   return allPosts;
		  
	  }
  
  
}
