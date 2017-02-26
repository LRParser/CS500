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
                            <th>Update Date</th>
                            <th>Name</th>
                            <th>Reactions</th>
                            <th>Shares Count</th>  
                            <th>Message</th>
                            <th>User Id</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                    <%
                    ArrayList<UserPost> allPosts = (ArrayList<UserPost>)request.getAttribute("alluserposts");	
                    for (int i=0; i<allPosts.size(); i++) {
                		UserPost post = allPosts.get(i);
                		%>
                		<tr>
                        
                        <td><%=post.getId() %></td>
                        <td><%=post.getUpdateDate()%></td>
                        <td><%=post.getName()%></td>
                        <td><%=post.getReactions() %></td>
                        <td><%=post.getSharesCount() %></td>  
                        <td><%=post.getMessage()%></td>
                        <td><%=post.getUserId() %></td>
                        
                    </tr>
                		
                	   <% }
                    %>
                    
                    </tbody>
</table>
</div>



</body>
</html>
<%@include file ="footer.jsp"%>