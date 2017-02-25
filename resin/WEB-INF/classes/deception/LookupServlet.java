package deception;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LookupServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserRegister _reg;
    private String _message;

    public void init() throws ServletException {
	_reg = new UserRegister();
	if(_reg == null) {
		System.out.println("_reg is null");
	}
	else {
		System.out.println("_reg is not null");
	}
	_message = _reg.openDBConnection("PgBundle");
	if(_message == null) {
		System.out.println("_message is null");
	}
	else {
		System.out.println("_message is not null");
	}
	
    }

    
    
    
    public void printUser(PrintWriter out, HttpServletRequest request, HttpServletResponse response ) {

    	
    	try {
    	    ArrayList<User> roster = _reg.getUser();
    	    request.setAttribute("userlist", roster);
    	    RequestDispatcher view = request.getRequestDispatcher("userview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    	    
    	    
    	} catch (SQLException sqle) {
    	    sqle.printStackTrace(out);
    	}
    	
        }
    	
    public void printSomeUser(PrintWriter out, HttpServletRequest request, HttpServletResponse response ) {

    	
    	ArrayList<User> roster = new ArrayList<User>();
    	
    	try {
    	    User user = _reg.getSomeUser(request);
    	    if(user != null) {
    	    	roster.add(user);
    	    }
    	    request.setAttribute("userlist", roster);
    	    RequestDispatcher view = request.getRequestDispatcher("userview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    	    
    	   
    	} catch (SQLException sqle) {
    	    sqle.printStackTrace(out);
    	}
    	
        }
    public void printUserEducationExperience(PrintWriter out, HttpServletRequest request, HttpServletResponse response)
    {
    	try {
			UserEducationExperience use = _reg.getUserEducationExperience(request);
			request.setAttribute("usereducation", use);
    	    RequestDispatcher view = request.getRequestDispatcher("usereducationview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    public void printUserWorkExperience(PrintWriter out, HttpServletRequest request, HttpServletResponse response)
    {
    	try {
			UserWorkExperience uwe = _reg.getUserWorkExperience(request);
			request.setAttribute("userwork", uwe);
    	    RequestDispatcher view = request.getRequestDispatcher("userworkview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    public void printUserOwnedGroups(PrintWriter out, HttpServletRequest request, HttpServletResponse response)
    {
    	try {
    		ArrayList<Group> allgroups = _reg.getUserOwnedGroups(request);
			request.setAttribute("allgroups", allgroups);
    	    RequestDispatcher view = request.getRequestDispatcher("groupview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    public void printUserOwnedPages(PrintWriter out, HttpServletRequest request, HttpServletResponse response)
    {
    	try {
    		ArrayList<Page> allPages = _reg.getUserOwnedPages(request);
			request.setAttribute("allpages", allPages);
    	    RequestDispatcher view = request.getRequestDispatcher("pageview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void printUserOwnedPosts(PrintWriter out, HttpServletRequest request, HttpServletResponse response)
    {
    	try {
    		ArrayList<UserPost> allPosts = _reg.getUserOwnedPosts(request);
			request.setAttribute("allposts", allPosts);
    	    RequestDispatcher view = request.getRequestDispatcher("postview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void printPageOwnedPosts(PrintWriter out, HttpServletRequest request, HttpServletResponse response)
    {
    	try {
    		ArrayList<PagePost> allPosts = _reg.getPageOwnedPosts(request);
			request.setAttribute("allposts", allPosts);
    	    RequestDispatcher view = request.getRequestDispatcher("pagepostview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void printGroupOwnedPosts(PrintWriter out, HttpServletRequest request, HttpServletResponse response)
    {
    	try {
    		ArrayList<GroupPost> allPosts = _reg.getGroupOwnedPosts(request);
			request.setAttribute("allposts", allPosts);
    	    RequestDispatcher view = request.getRequestDispatcher("grouppostview.jsp");
    	    try {
				view.forward(request, response);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
  
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
      
	if (!_message.startsWith("Servus")) {
		
		out.println("<html><head></head><body>");
	    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
	    out.println("</table>");
		out.println("</html>");
	} else {
	    printUser(out, request, response);
	}
	  
	

	
    }
  
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {  
	System.out.println("Quering a particular Customer");
	
	
	response.setContentType("text/html");
	String action = request.getParameter("action");
	
	if(action.equals("user"))
	{
		
		PrintWriter out = response.getWriter();
		
	      
		if (!_message.startsWith("Servus")) {
		    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
		} else {
		    printSomeUser(out, request, response);
		}
		  
		out.println("</table>");
		out.println("</html>");
		
	}
	else if (action.equals("education"))
	{
		PrintWriter out = response.getWriter();
		
	      
		if (!_message.startsWith("Servus")) {
			out.println("<html><head></head><body>");
		    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
		    out.println("</html>");
		} else {
		    printUserEducationExperience(out, request, response);
		}
		  
		
		
		
	}
	else if (action.equals("all"))
	{
		doGet(request, response);
		
	}
	else if(action.equals("work"))
	{
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
	      
		if (!_message.startsWith("Servus")) {
		    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
		} else {
		    printUserWorkExperience(out, request, response);
		}
		  
		out.println("</table>");
		out.println("</html>");
		
	}
	else if(action.equals("group"))
	{
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
	      
		if (!_message.startsWith("Servus")) {
		    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
		} else {
			printUserOwnedGroups(out, request, response);
		}
		  
		out.println("</table>");
		out.println("</html>");
		
	}
	
	else if(action.equals("page"))
	{
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
	      
		if (!_message.startsWith("Servus")) {
		    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
		} else {
			printUserOwnedPages(out, request, response);
		}
		  
		out.println("</table>");
		out.println("</html>");
		
	}
	else if(action.equals("post"))
	{
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
	      
		if (!_message.startsWith("Servus")) {
		    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
		} else {
			printUserOwnedPosts(out, request, response);
		}
		  
		out.println("</table>");
		out.println("</html>");
		
	}
	else if(action.equals("pagepost"))
	{
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
	      
		if (!_message.startsWith("Servus")) {
		    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
		} else {
			printPageOwnedPosts(out, request, response);
		}
		  
		out.println("</table>");
		out.println("</html>");
		
	}
	else if(action.equals("grouppost"))
	{
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
	      
		if (!_message.startsWith("Servus")) {
		    out.println("<h1>Databaase connection failed to open " + _message + "</h1>");
		} else {
			printGroupOwnedPosts(out, request, response);
		}
		  
		out.println("</table>");
		out.println("</html>");
		
	}
	
    }
	
    

    public void destroy() {
	_reg.closeDBConnection();
    }
}

