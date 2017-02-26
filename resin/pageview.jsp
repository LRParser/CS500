<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*"%>
    <%@ page import = "deception.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page View</title>
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
                            <th>Owner User ID</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                    <%
                    ArrayList<deception.Page> allPages = (ArrayList<deception.Page>)request.getAttribute("allpages");	
                    for (int i=0; i<allPages.size(); i++) {
                    	deception.Page currentPage = (deception.Page)allPages.get(i);%>
                		<tr>
                        
                        <td><%=currentPage.getId() %></td>
                        <td><%=currentPage.getName() %></td>
                        <td><%=currentPage.getAbout() %></td>
                        <td><%=currentPage.getEmail() %></td>
                        <td><%=currentPage.getIsverified() %></td>  
                        <td><%=currentPage.getProfilePicture() %></td>
                        <td><%=currentPage.getContactAddress() %></td>
                        <td><%=currentPage.getUserId() %></td>
                        
                    </tr>
                		
                	   <% }
                    %>
                    
                    </tbody>
</table>

</div>



</body>
</html>
<%@include file ="footer.jsp"%>