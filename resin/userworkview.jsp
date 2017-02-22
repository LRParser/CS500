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
                            <th>Employer</th>
                            
                            <th>User ID</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                    <%
                   UserWorkExperience uwe = (UserWorkExperience)request.getAttribute("userwork");	
                    %>
                		<tr>
                        
                        <th><%=uwe.getId() %></th>
                        <th><%=uwe.getEmployer()%></th>
                        
                        <th><%=uwe.getUserId()%></th>
                        
                    </tr>
                		
                	   
                    
                    
                    </tbody>
</table>
</div>



</body>
</html>
<%@include file ="footer.jsp"%>