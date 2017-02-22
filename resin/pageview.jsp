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
                    ArrayList<Page> allPages = (ArrayList<Page>)request.getAttribute("allpages");	
                    for (int i=0; i<allPages.size(); i++) {
                		Page page1 = allPages.get(i);
                		%>
                		<tr>
                        
                        <th><%=page1.getId() %></th>
                        <th><%=page1.getName() %></th>
                        <th><%=page1.getAbout() %></th>
                        <th><%=page1.getEmail() %></th>
                        <th><%=page1.getIsverified() %></th>  
                        <th><%=page1.getProfilePicture() %></th>
                        <th><%=page1.getContactAddress() %></th>
                        <th><%=page1.getContactAddress() %></th>
                    </tr>
                		
                	   <% }
                    %>
                    
                    </tbody>
</table>
</div>



</body>
</html>
<%@include file ="footer.jsp"%>