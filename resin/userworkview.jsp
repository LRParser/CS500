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

<% ArrayList<UserWorkExperience> roster = (ArrayList<UserWorkExperience>)request.getAttribute("userwork"); %>                     	
					<%if(roster == null || roster.size() == 0){ %>
						<p>No results</p>
					<%} else { %>

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
                    for (int i=0; i<roster.size(); i++) {
                		UserWorkExperience uwe = (UserWorkExperience)roster.get(i);
                	%>
                		<tr>
                        
                        <td><%=uwe.getId() %></td>
                        <td><%=uwe.getEmployer()%></td>
                        <td><%=uwe.getUserId()%></td>
                    </tr>
					<% } %>
					<% } %>

                	                       
                    </tbody>
                    </table>

</div>



</body>
</html>
<%@include file ="footer.jsp"%>