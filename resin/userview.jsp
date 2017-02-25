<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*"%>
    <%@ page import = "deception.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User View</title>
</head>
<body>
<div>

                    <% ArrayList<User> roster = (ArrayList<User>)request.getAttribute("userlist"); %>                     	
					<%if(roster == null || roster.size() == 0){ %>
						<p>No results</p>
					<%} else { %>

					<table >
                    <thead>
                        <tr>
                           
                            <th>ID</th>
                            <th>Name</th>
                            <th>About</th>
                            <th>Email</th>
                            <th>Is Verified</th>  
                            <th>Profile Picture</th>
                            <th>Contact Address</th>
                            <th>Likes</th>
                            <th>Friends Count</th> 
                            <th>Member Since</th> 
                        </tr>
                    </thead>
                    <tbody>
					<%
                    for (int i=0; i<roster.size(); i++) {
                		User user = (User)roster.get(i);
                	%>
                		<tr>
                        
                        <th><%=user.getId() %></th>
                        <th><%=user.getName() %></th>
                        <th><%=user.getAbout() %></th>
                        <th><%=user.getEmail() %></th>
                        <th><%=user.getIsverified() %></th>  
                        <th><%=user.getProfilePicture() %></th>
                        <th><%=user.getContactAddress() %></th>
                        <th><%=user.getLikes() %></th>
                        <th><%=user.getFriendsCount() %></th> 
                        <th><%=user.getMemberSince() %></th> 
                    </tr>
					<% } %>
					<% } %>

                	                       
                    </tbody>
</table>
</div>



</body>
</html>
<%@include file ="footer.jsp"%>