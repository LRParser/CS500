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
                            
                        </tr>
                    </thead>
                    <tbody>
                    <%
                    ArrayList<Group> allgroups = (ArrayList<Group>)request.getAttribute("allgroups");	
                    for (int i=0; i<allgroups.size(); i++) {
                		Group group = (Group)allgroups.get(i);%>
                		<tr>
                        
                        <th><%=group.getId() %></th>
                        <th><%=group.getName() %></th>
                        <th><%=group.getAbout() %></th>
                        <th><%=group.getEmail() %></th>
                        <th><%=group.getIsverified() %></th>  
                        <th><%=group.getProfilePicture() %></th>
                        <th><%=group.getContactAddress() %></th>
                        
                    </tr>
                		
                	   <% }
                    %>
                    
                    </tbody>
</table>
</div>



</body>
</html>
<%@include file ="footer.jsp"%>